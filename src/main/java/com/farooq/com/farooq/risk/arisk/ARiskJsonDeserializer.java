package com.farooq.risk.arisk;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;
import java.util.Map;

public class ARiskJsonDeserializer<T> implements Deserializer {

    private Class<T> deserializedClass;
    private ObjectMapper objectMapper;


    public ARiskJsonDeserializer(){
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public ARiskJsonDeserializer(Class<T> deserializedClass) {
        this.deserializedClass = deserializedClass;
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Override
    public void configure(Map map, boolean b) {
        if(deserializedClass == null) {
            deserializedClass = (Class<T>) map.get("serializedClass");
        }
    }

    @Override
    public T deserialize(String s, byte[] bytes) {
        if(bytes == null){
            return null;
        }
        try {
            String value = new String(bytes);
            System.out.println("value of string is "+ value + "for deserialized class "+deserializedClass.getName());
            return objectMapper.readValue(value, this.deserializedClass);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {

    }
}
