package com.farooq.risk.arisk.position;


import com.farooq.risk.arisk.position.model.PositionKey;
import com.farooq.risk.arisk.position.model.PositionValue;
import com.farooq.risk.arisk.position.serde.AriskPositionKeyJsonSerializer;
import com.farooq.risk.arisk.position.serde.AriskPositionValueJsonSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class PositionProducer {


    private static final String topic = "input-position-topic-6";;

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");

        AriskPositionKeyJsonSerializer positionKeyAriskJsonSerializer = new AriskPositionKeyJsonSerializer();
        AriskPositionValueJsonSerializer positionValueAriskJsonSerializer = new AriskPositionValueJsonSerializer();

       // properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, positionKeyAriskJsonSerializer.getClass().getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, positionValueAriskJsonSerializer.getClass().getName());

        //Thread.currentThread().setContextClassLoader(null);

        Producer<PositionKey, PositionValue> positionProducer = new KafkaProducer<>(properties);



        PositionKey positionKey = new PositionKey();
        positionKey.setId("Pid14");

        PositionValue positionValue = new PositionValue();
        positionValue.setId("Pid14");

        try {

            positionProducer.send(newPositionRecord(positionKey,positionValue));
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));

            Thread.sleep(TimeUnit.SECONDS.toMillis(2));
            positionProducer.close();
            System.out.println("Closed stream after producing positions");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static ProducerRecord<PositionKey,PositionValue> newPositionRecord(PositionKey positionKey,PositionValue positionValue) {
        return new ProducerRecord(topic, positionKey,positionValue);
    }
}
