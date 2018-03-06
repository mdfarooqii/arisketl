package com.farooq.risk.arisk;

import com.farooq.risk.arisk.position.model.PositionKey;
import com.farooq.risk.arisk.position.model.PositionValue;
import com.farooq.risk.arisk.riskvalue.model.RiskValue;
import com.farooq.risk.arisk.riskvalue.model.RiskValueKey;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.processor.ProcessorContext;
import org.apache.kafka.streams.processor.StateStoreSupplier;
import org.apache.kafka.streams.state.KeyValueStore;
import org.apache.kafka.streams.state.Stores;

import java.util.Properties;
import java.util.Random;

public class ARiskCoreETLDriver {

    public static void main(String[] args) {

        String risk_value_input_topic_1 = args[0];
        String position_input_topic_1 = args[1];
        String mds_input_topic_1 = args[2];

        String risk_value_output_topic_1 = args[3];
        String position_output_topic_1 = args[4];
        String mds_output_topic_1 = args[5];

        String position_dedups_topic = "position_dedups_topic_1";



        Properties config = new Properties();
        config.put(StreamsConfig.APPLICATION_ID_CONFIG, "arisk-etl-kafka-poc-1");
        config.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        AriskJsonSerializer<PositionKey> positionKeyAriskJsonSerializer = new AriskJsonSerializer<PositionKey>(PositionKey.class);
        ARiskJsonDeserializer<PositionKey> positionKeyARiskJsonDeserializer = new ARiskJsonDeserializer<PositionKey>(PositionKey.class);
        Serde<PositionKey> positionKeySerde = Serdes.serdeFrom(positionKeyAriskJsonSerializer, positionKeyARiskJsonDeserializer);

        AriskJsonSerializer<PositionValue> positionValueAriskJsonSerializer = new AriskJsonSerializer<PositionValue>(PositionValue.class);
        ARiskJsonDeserializer<PositionValue> positionValueARiskJsonDeserializer = new ARiskJsonDeserializer<PositionValue>(PositionValue.class);
        Serde<PositionValue> positionValueSerde = Serdes.serdeFrom(positionValueAriskJsonSerializer, positionValueARiskJsonDeserializer);

        AriskJsonSerializer<RiskValueKey> RiskValueKeyAriskJsonSerializer = new AriskJsonSerializer<RiskValueKey>(RiskValueKey.class);
        ARiskJsonDeserializer<RiskValueKey> RiskValueKeyARiskJsonDeserializer = new ARiskJsonDeserializer<RiskValueKey>(RiskValueKey.class);
        Serde<RiskValueKey> riskValueKeySerde = Serdes.serdeFrom(RiskValueKeyAriskJsonSerializer, RiskValueKeyARiskJsonDeserializer);

        AriskJsonSerializer<RiskValue> RiskValueAriskJsonSerializer = new AriskJsonSerializer<RiskValue>(RiskValue.class);
        ARiskJsonDeserializer<RiskValue> RiskValueARiskJsonDeserializer = new ARiskJsonDeserializer<RiskValue>(RiskValue.class);
        Serde<RiskValue> riskValueSerde = Serdes.serdeFrom(RiskValueAriskJsonSerializer, RiskValueARiskJsonDeserializer);

        KStreamBuilder kStreamBuilder = new KStreamBuilder();
        //1) Get Position input Stream (with duplicates)
        //2) Add a transformer which will filter duplicates and generates the random PositionId (Sequence) and publish to new stream
        //3) Consume the new position stream and create a GlobalKTable with key as id
        //4) Enrich riskStream by joining and update riskValue with positionId and publish to topic
        //5) Output the riskStream for consumption
        //6) Repeat similarly for MDS

        //TODO : Identify key for position , can it be Object with all the required columns ?
        //TODO : Identify key for riskvalue , can it be Object with all the required columns?

        StateStoreSupplier positionLogicalKeyStore = Stores.create("arisk_distinct_position_id_store")
                .withKeys(Serdes.String()) // to store logical_key
                .withValues(Serdes.Long()) // to store the incremental Arisk specific position id
                .persistent()
                .build();

        kStreamBuilder.addStateStore(positionLogicalKeyStore);


        //Handle positions
        KStream<PositionKey,PositionValue> posInputStream = kStreamBuilder.stream(positionKeySerde,positionValueSerde,position_input_topic_1);
        KStream<String , PositionValue> posDeDuplicatedStream = posInputStream.transform(new PositionDeDupsTransformationSupplier(positionLogicalKeyStore.name()),positionLogicalKeyStore.name());
        posDeDuplicatedStream.to(Serdes.String(), positionValueSerde, position_dedups_topic);
        GlobalKTable<String,PositionValue> positionGTable = kStreamBuilder.globalTable(Serdes.String(), positionValueSerde, position_dedups_topic);

        //Handle Riskvalue enrichment with Position data , example pos instrument etc (yet to be implemented in transformer)
        KStream<RiskValueKey,RiskValue> riskValueInputStream = kStreamBuilder.stream(riskValueKeySerde,riskValueSerde,risk_value_input_topic_1);
        KStream<RiskValueKey,RiskValue> riskValuePosEnrichedJoinStream = riskValueInputStream.leftJoin(
                positionGTable,
                (riskValueKey, riskValue) -> riskValue.getPositionId(),
                ((riskValue, positionValue) ->  {
                    riskValue.setPositionId(positionValue.getId());
                    return riskValue;
                }));
        //Print the risk value with position enrichment
        riskValuePosEnrichedJoinStream.print(riskValueKeySerde,riskValueSerde);


        //Start the kafka stream
        KafkaStreams streams = new KafkaStreams(kStreamBuilder, config);
        streams.start();

        // shutdown hook to correctly close the streams application
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

        while(true){
            System.out.println(streams.toString());
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                break;
            }
        }

    }

    /* Position dedupsTransformer  Start */
    private static final class PositionDeDupsTransformationSupplier<P,P1,K> implements TransformerSupplier<PositionKey,PositionValue,KeyValue<String,PositionValue>> {

        private String stateStoreName;


        public PositionDeDupsTransformationSupplier(String stateStoreName){
            this.stateStoreName = stateStoreName;
        }


        @Override
        public Transformer<PositionKey,PositionValue, KeyValue<String,PositionValue>> get() {
            return new Transformer<PositionKey,PositionValue, KeyValue<String,PositionValue>>() {

                private KeyValueStore<String,Long> stateStore;

                @Override
                public void init(ProcessorContext processorContext) {
                    this.stateStore = (KeyValueStore<String,Long>) processorContext.getStateStore(stateStoreName);
                }

                @Override
                public KeyValue<String,PositionValue> transform(PositionKey key, PositionValue value) {

                    Long existingPositionIdValue  = stateStore.get(value.getId());
                    System.out.println(String.format("oldvalue [%s] for key [%s]",existingPositionIdValue,key));
                    if(existingPositionIdValue!=null){
                        System.out.println("inside match value["+value.getLogicalKey() +"] oldvalue ["+existingPositionIdValue+"]");
                        return null;
                    }

                    //If new position get a new running sequence
                    stateStore.put(value.getId(), (long)(Math.random() * 1000));
                    return new KeyValue<>(key.getId(),value);
                }

                @Override
                public KeyValue<String,PositionValue> punctuate(long l) {
                    return null;
                }

                @Override
                public void close() {

                }
            };
        }
    }



    /* Position dedupsTransformer End*/








}
