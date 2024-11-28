package com.example.cache;

import com.example.EntityMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.gleif.data.schema.leidata._2016.LEIRecordType;
import reactor.core.publisher.Flux;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFLux {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        //log.info("Count {}", counter.incrementAndGet());
        Flux.using(

                        // resource factory creates FileReader instance
                        () -> new FileReader("/home/nakul/Downloads/20240927-0800-gleif-goldencopy-lei2-golden-copy.xml.json"),

                        // transformer function turns the FileReader into a Flux
                        reader -> Flux.fromStream(new BufferedReader(reader).lines()),

                        // resource cleanup function closes the FileReader when the Flux is complete
                        reader -> {
                            try {
                                reader.close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                ).map(line -> {
                    try {
                        return objectMapper.readValue(line, LEIRecordType.class);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(l -> EntityMapper.ENTITY_MAPPER.map(l, 1, 1))
                .subscribe(System.out::println);
    }
}
