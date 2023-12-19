package com.example.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Flow;

import com.mongodb.client.result.UpdateResult;
import jakarta.xml.bind.JAXBException;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.gleif.data.schema.leidata._2016.LEIRecordType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.example.demo.parser.XmlDataParser;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import reactor.core.publisher.Flux;

import javax.xml.stream.XMLStreamException;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.*;
import static org.springframework.data.mongodb.core.query.Update.update;

@SpringBootApplication
@Slf4j
public class GliefstuffApplication implements ApplicationRunner {

    static final String COLLECTION = "lEIRecordType";

    public static void main(String[] args) {
        SpringApplication.run(GliefstuffApplication.class, args);


    }

    @Autowired
    private XmlDataParser dataParser;
    @Autowired
    private LEIRecordRepository leiRecordRepository;


    long counter = 0;

    @Override
    public void run(ApplicationArguments args) throws Exception {


        updateBic();


    }

    private void updateBic() throws IOException {

        String file = "/home/nakul/Downloads/gleif/lei-bic-20231124T000000.csv";

        long count = 0;
        long matchedCount = 0;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(file))) {
            reader.readLine();
            String line;
            long start = System.currentTimeMillis();
            while ((line = reader.readLine()) != null) {
                count++;
                String[] split = line.split(",", 2);
                //mongoTemplate.updateFirst(query(where("name").is("Joe")), update("age", 35), Person.class);
                Query leiQuery = query(where("lei").is(split[0]));
                Update update = new Update().push("altIds").each(new Document().append("type", "BIC").append("value", split[1]));
                UpdateResult response = mongoTemplate.updateFirst(leiQuery, update, COLLECTION);
                matchedCount += response.getModifiedCount();
                if (count % 1000 == 0) {
                                        long time = (System.currentTimeMillis() - start);
                    log.info(" Count = {} Matched ={} Time = {} Average = {}", count, matchedCount, time, time / (count));
                }

            }
        }

    }

    public void loadGelifData() throws XMLStreamException, JAXBException, FileNotFoundException {
        leiRecordRepository.deleteAll();
        long start = System.currentTimeMillis();
        List<LEIRecordType> buffer = new ArrayList<>(1000);
        dataParser.parse((LEIRecordType record) -> {
            counter++;
            buffer.add(record);

            if (counter % 1000 == 0) {
                leiRecordRepository.saveAll(buffer);
                buffer.clear();
                long time = (System.currentTimeMillis() - start);
                log.info(" Count = {} Time = {} Average = {}", counter, time, time / (counter / 1000));
            }

        });
        leiRecordRepository.saveAll(buffer);
    }


    private final MongoTemplate mongoTemplate;

    public GliefstuffApplication(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

}
