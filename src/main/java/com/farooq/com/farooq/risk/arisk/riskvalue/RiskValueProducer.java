package com.farooq.risk.arisk.riskvalue;


import com.farooq.risk.arisk.riskvalue.model.RiskValue;
import com.farooq.risk.arisk.riskvalue.model.RiskValueKey;
import com.farooq.risk.arisk.riskvalue.serde.AriskRVKeyJsonSerializer;
import com.farooq.risk.arisk.riskvalue.serde.AriskRVValueJsonSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class RiskValueProducer {


    private static final String topic = "input-riskvalue-topic-6";;

    public static void main(String[] args) {
        Properties properties = new Properties();

        // kafka bootstrap server
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");

        AriskRVKeyJsonSerializer ariskRVKeyJsonSerializer = new AriskRVKeyJsonSerializer();
        AriskRVValueJsonSerializer ariskRVValueJsonSerializer = new AriskRVValueJsonSerializer();

        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, ariskRVKeyJsonSerializer.getClass().getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ariskRVValueJsonSerializer.getClass().getName());

        Producer<RiskValueKey,RiskValue> producer = new KafkaProducer<>(properties);

        RiskValueKey riskValueKey1 = new RiskValueKey.RiskValueKeyBuilder().build();




       // producer.send(newRiskValueRecord(riskValueKey, riskValue));
       // producer.send(newRiskValueRecord(riskValueKey1, riskValue1));

        producer.close();

    }

    public static ProducerRecord<RiskValueKey,RiskValue> newRiskValueRecord(RiskValueKey riskValueKey, RiskValue riskValue) {
        return new ProducerRecord<RiskValueKey,RiskValue>(topic, riskValueKey ,riskValue);
    }
}
