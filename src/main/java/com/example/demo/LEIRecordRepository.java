package com.example.demo;

import org.gleif.data.schema.leidata._2016.LEIRecordType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LEIRecordRepository extends MongoRepository<LEIRecordType, Long>
 {

}
