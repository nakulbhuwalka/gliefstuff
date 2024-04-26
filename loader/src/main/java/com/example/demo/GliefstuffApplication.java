package com.example.demo;

import com.example.demo.parser.XmlDataParser;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBException;
import lombok.extern.slf4j.Slf4j;
import org.gleif.data.schema.leidata._2016.LEIRecordType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.stream.XMLStreamException;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



@SpringBootApplication
@Slf4j
public class GliefstuffApplication implements ApplicationRunner {

    static final String COLLECTION = "lEIRecordType";
    @Value("${gleif.file.path}")
    String gleifFilePath;
    public static void main(String[] args) {
        SpringApplication.run(GliefstuffApplication.class, args);


    }

    @Autowired
    private XmlDataParser dataParser;



    long counter = 0;

    @Override
    public void run(ApplicationArguments args) throws Exception {


        loadGelifData();


    }

//    private void updateBic() throws IOException {
//
//        String file = "/home/nakul/Downloads/gleif/lei-bic-20231124T000000.csv";
//
//        long count = 0;
//        long matchedCount = 0;
//        try (BufferedReader reader = Files.newBufferedReader(Paths.get(file))) {
//            reader.readLine();
//            String line;
//            long start = System.currentTimeMillis();
//            while ((line = reader.readLine()) != null) {
//                count++;
//                String[] split = line.split(",", 2);
//                //mongoTemplate.updateFirst(query(where("name").is("Joe")), update("age", 35), Person.class);
//                Query leiQuery = query(where("lei").is(split[0]));
//                Update update = new Update().push("altIds").each(new Document().append("type", "BIC").append("value", split[1]));
//                UpdateResult response = mongoTemplate.updateFirst(leiQuery, update, COLLECTION);
//                matchedCount += response.getModifiedCount();
//                if (count % 1000 == 0) {
//                                        long time = (System.currentTimeMillis() - start);
//                    log.info(" Count = {} Matched ={} Time = {} Average = {}", count, matchedCount, time, time / (count));
//                }
//
//            }
//        }
//
//    }

    public void loadGelifData() throws XMLStreamException, JAXBException, IOException {


        try(BufferedWriter writer= Files.newBufferedWriter(Paths.get(gleifFilePath+".json"))) {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonGenerator jsonGenerator= objectMapper.writerFor(LEIRecordType.class).createGenerator(writer);
            dataParser.parse((LEIRecordType record) -> {
                try {
                    jsonGenerator.writeObject(record);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            });
            jsonGenerator.close();
        }

    }




}
