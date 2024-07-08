package com.example.cqrsBankingApp.domain.model;


import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.SneakyThrows;

@Converter
public class ObjectConverter implements AttributeConverter<Object,String> {

    //map from object to json
    @Override
    @SneakyThrows
    public String convertToDatabaseColumn(Object attr) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(attr);
    }

    @Override
    public Object convertToEntityAttribute(String dbData) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(dbData,Object.class);
    }
}
