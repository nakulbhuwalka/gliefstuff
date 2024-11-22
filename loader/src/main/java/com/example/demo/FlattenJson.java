package com.example.demo;

import com.example.EntityMapper;
import com.example.gleif.entity.Entity;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.gleif.data.schema.leidata._2016.LEIRecordType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FlattenJson {

    static String gleifFilePath="/home/nakul/Downloads/20240927-0800-gleif-goldencopy-lei2-golden-copy.xml.json";
    public static void main(String[] args) throws IOException {


        ObjectMapper objectMapper = new ObjectMapper();
        Files.lines(Path.of(gleifFilePath)).forEach(line ->
        {
            try {

                LEIRecordType value = objectMapper.readValue(line, LEIRecordType.class);

                System.out.println(EntityMapper.ENTITY_MAPPER.map(value));
              //  System.out.println(EntityMapper.ENTITY_MAPPER.addressTypeToAddress(value.getEntity().getLegalAddress()));
              //  System.out.println(EntityMapper.ENTITY_MAPPER.addressTypeToAddress(value.getEntity().getHeadquartersAddress()));


            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        });

    }
}
