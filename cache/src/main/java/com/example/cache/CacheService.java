package com.example.cache;

import lombok.extern.slf4j.Slf4j;
import org.gleif.data.schema.leidata._2016.LEIRecordType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@Slf4j
@RestController
public class CacheService {

    AtomicLong counter = new AtomicLong();
    @Autowired
    private final GleifCache  gleifCache;

    public CacheService(GleifCache gleifCache) {
        this.gleifCache = gleifCache;
    }


    @GetMapping("/gleif/{lei}")
    public LEIRecordType getLeiRecordType(@PathVariable String lei)
    {
        //log.info("Count {}", counter.incrementAndGet());
        return gleifCache.get(lei);
    }
}
