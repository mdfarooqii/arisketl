package com.farooq.risk.arisk.position.serde;

import com.farooq.risk.arisk.position.model.PositionKey;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class AriskPositionKeyJsonSerializer implements Serializer<PositionKey> {


    private ObjectMapper objectMapper;


    public AriskPositionKeyJsonSerializer(){
        this.objectMapper = new ObjectMapper();
    }



    @Override
    public void configure(Map map, boolean b) {

    }

    @Override
    public byte[] serialize(String s, PositionKey t) {
        byte[] bytes = null;
        try {
            if(t!=null) {
                //System.out.println(" ........... Object mapper ......"+ objectMapper+ "serializedClass = "+serializedClass);
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
