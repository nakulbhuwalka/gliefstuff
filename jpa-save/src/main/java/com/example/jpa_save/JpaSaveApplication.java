package com.example.jpa_save;

import com.example.EntityMapper;
import com.example.gleif.entity.LegalEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Iterators;
import org.gleif.data.schema.leidata._2016.LEIRecordType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@SpringBootApplication
@EntityScan("com.example.gleif.entity")
public class JpaSaveApplication implements ApplicationRunner {
    private static final Logger log = LoggerFactory.getLogger(JpaSaveApplication.class);
    String gleifFilePath = "/home/nakul/Downloads/";
    String gleifFile = "20240623-0000-gleif-goldencopy-lei2-golden-copy.xml.json";

    private final LegalEntityRepository legalEntityRepository;

    public JpaSaveApplication(LegalEntityRepository legalEntityRepository) {
        this.legalEntityRepository = legalEntityRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(JpaSaveApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {


        long asOfDate = Long.parseLong(gleifFile.split("-")[0]);
        long asOfTime = Long.parseLong(gleifFile.split("-")[1]);

        ObjectMapper objectMapper = new ObjectMapper();

        long start = System.currentTimeMillis();
        List<LegalEntity> les = Files.lines(Path.of(gleifFilePath, gleifFile))
//                .limit(10000)
                .parallel()

                .map(line -> {
                    try {
                        return objectMapper.readValue(line, LEIRecordType.class);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(value -> EntityMapper.ENTITY_MAPPER.map(value, asOfDate, asOfTime))
                .toList();
        log.info("Read all lines {} in time {}", les.size(), System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        Iterators.partition(les.iterator(),1000).forEachRemaining(legalEntityRepository::saveAll);
       // ListUtils l;
        //legalEntityRepository.saveAllAndFlush(les);

        log.info("saved all lines {} in time {}", les.size(), System.currentTimeMillis() - start);


    }
}
