package com.farooq.risk.arisk.position.serde;

import com.farooq.risk.arisk.position.model.PositionKey;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class PositionKeySerde implements Serde<PositionKey> {

    private AriskPositionKeyJsonSerializer serializer = new AriskPositionKeyJsonSerializer();
    private ARiskPositionKeyJsonDeserializer deserializer = new ARiskPositionKeyJsonDeserializer();


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
    public Serializer<PositionKey> serializer() {
        return serializer;
    }

    @Override
    public Deserializer<PositionKey> deserializer() {
        return deserializer;
    }
}
