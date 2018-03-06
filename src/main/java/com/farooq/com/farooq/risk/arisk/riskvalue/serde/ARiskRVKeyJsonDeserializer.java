package com.farooq.risk.arisk.riskvalue.serde;

import com.farooq.risk.arisk.riskvalue.model.RiskValueKey;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;
import java.util.Map;

public class ARiskRVKeyJsonDeserializer implements Deserializer {

        private ObjectMapper objectMapper;


    public ARiskRVKeyJsonDeserializer(){
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }


    @Override
    public void configure(Map map, boolean b) {

    }

    @Override
    public RiskValueKey deserialize(String s, byte[] bytes) {
        if(bytes == null){
            return null;
        }
        try {
            String value = new String(bytes);
            return objectMapper.readValue(value, RiskValueKey.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {

    }
}
