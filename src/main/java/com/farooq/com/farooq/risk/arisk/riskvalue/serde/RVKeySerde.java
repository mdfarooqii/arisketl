package com.farooq.risk.arisk.riskvalue.serde;

import com.farooq.risk.arisk.riskvalue.model.RiskValueKey;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class RVKeySerde implements Serde<RiskValueKey> {

    private AriskRVKeyJsonSerializer serializer = new AriskRVKeyJsonSerializer();
    private ARiskRVKeyJsonDeserializer deserializer = new ARiskRVKeyJsonDeserializer();


    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        serializer.configure(configs, isKey);
        deserializer.configure(configs, isKey);
    }

    @Override
    public void close() {
        serializer.close();
        deserializer.close();
    }

    @Override
    public Serializer<RiskValueKey> serializer() {
        return serializer;
    }

    @Override
    public Deserializer<RiskValueKey> deserializer() {
        return deserializer;
    }
}
