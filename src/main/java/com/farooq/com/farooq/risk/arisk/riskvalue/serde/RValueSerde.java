package com.farooq.risk.arisk.riskvalue.serde;

import com.farooq.risk.arisk.riskvalue.model.RiskValue;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class RValueSerde implements Serde<RiskValue> {

    private AriskRVValueJsonSerializer serializer = new AriskRVValueJsonSerializer();
    private ARiskRVValueJsonDeserializer deserializer = new ARiskRVValueJsonDeserializer();


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
    public Serializer<RiskValue> serializer() {
        return serializer;
    }

    @Override
    public Deserializer<RiskValue> deserializer() {
        return deserializer;
    }
}
