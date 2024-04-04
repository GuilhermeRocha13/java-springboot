package com.springwatch.services;

import com.springwatch.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class dataConvert implements idataConvert {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T dataGet(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
