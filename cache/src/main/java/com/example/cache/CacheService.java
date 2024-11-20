package com.example.cache;

import org.gleif.data.schema.leidata._2016.LEIRecordType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheService {

    @Autowired
    private final GleifCache  gleifCache;

    public CacheService(GleifCache gleifCache) {
        this.gleifCache = gleifCache;
    }


    @GetMapping("/gleif/{lei}")
    public LEIRecordType getLeiRecordType(@PathVariable String lei)
    {
        return gleifCache.get(lei);
    }
}
