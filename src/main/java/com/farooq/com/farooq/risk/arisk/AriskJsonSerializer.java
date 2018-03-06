package com.farooq.risk.arisk;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class AriskJsonSerializer<T> implements Serializer<T> {

    private Class<T> serializedClass;
    private ObjectMapper objectMapper;


    public AriskJsonSerializer(){
        this.objectMapper = new ObjectMapper();
    }

    public AriskJsonSerializer(Class<T> serializedClass){
        this.serializedClass = serializedClass;
        this.objectMapper = new ObjectMapper();
    }


    @Override
    public void configure(Map map, boolean b) {

    }

    @Override
    public byte[] serialize(String s, T t) {
        byte[] bytes = null;
        try {
            if(t!=null) {
                System.out.println(" ........... Object mapper ......"+ objectMapper+ "serializedClass = "+serializedClass);
                bytes= objectMapper.writeValueAsBytes(t);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return bytes;
    }

    @Override
    public void close() {

    }
}
