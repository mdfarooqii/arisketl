package com.farooq.risk.arisk.position.serde;

import com.farooq.risk.arisk.position.model.PositionValue;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class PositionValueSerde implements Serde<PositionValue> {

    private AriskPositionValueJsonSerializer serializer = new AriskPositionValueJsonSerializer();
    private ARiskPositionValueJsonDeserializer deserializer = new ARiskPositionValueJsonDeserializer();


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
    public Serializer<PositionValue> serializer() {
        return serializer;
    }

    @Override
    public Deserializer<PositionValue> deserializer() {
        return deserializer;
    }
}
