package com.example.cache;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.gleif.data.schema.leidata._2016.LEIRecordType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
@CacheConfig(cacheNames = "gleif")
@Slf4j
public class GleifCache {

    @Autowired
    private final CacheManager cacheManager;

    public GleifCache(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @PostConstruct()
    public void postConstruct() throws IOException {
        log.info("Start Loading cache");
        Cache cache = cacheManager.getCache("gleif");
        log.info("Cache Type {}",cache.getClass());
        ObjectMapper objectMapper = new ObjectMapper();
        Files.lines(Path.of("/home/nakul/Downloads/20240927-0800-gleif-goldencopy-lei2-golden-copy.xml.json"))
                .forEach( line ->{
                    try {
                        LEIRecordType record = objectMapper.readValue(line, LEIRecordType.class);
                        cache.put(record.getLEI(),record);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                });


        log.info("Finished Loading cache");
    }



    @Cacheable
    public LEIRecordType get(String lei)
    {
        return null;
    }

}
