package com.example.demo;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.example.demo.parser.XmlDataParser;

@SpringBootApplication
public class GliefstuffApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(GliefstuffApplication.class, args);
		
	
	}
	
	@Autowired
	private XmlDataParser dataParser;
	@Autowired
	private LEIRecordRepository leiRecordRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
	
		
		dataParser.parse(leiRecordRepository::save);
	}
	
	
    private final MongoTemplate mongoTemplate;

    public GliefstuffApplication(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

}
