package com.farooq.risk.arisk.position.serde;

import com.farooq.risk.arisk.position.model.PositionKey;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;
import java.util.Map;

public class ARiskPositionKeyJsonDeserializer implements Deserializer {

        private ObjectMapper objectMapper;


    public ARiskPositionKeyJsonDeserializer(){
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }


    @Override
    public void configure(Map map, boolean b) {

    }

    @Override
    public PositionKey deserialize(String s, byte[] bytes) {
        if(bytes == null){
            return null;
        }
        try {
            String value = new String(bytes);
            return objectMapper.readValue(value, PositionKey.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {

    }
}
