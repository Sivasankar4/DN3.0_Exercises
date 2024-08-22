package com.code.api.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.code.api.json.CustomDeserializer;
import com.code.api.json.CustomSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import main.java.com.code.api.dto.BookDTO;

@Configuration
public class SerializationConfig {

  @Bean
  @SuppressWarnings({"rawtypes", "unchecked"})
  public ObjectMapper getObjectMapper() {
    ObjectMapper mapper = new ObjectMapper();
    SimpleModule simpleModule = new SimpleModule();
    simpleModule.addSerializer(new CustomSerializer());
    simpleModule.addDeserializer(BookDTO.class, new CustomDeserializer());
    mapper.registerModule(simpleModule);
    return mapper;
  }
}