package com.example.cache;

import com.example.EntityMapper;
import com.example.gleif.entity.LegalEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.gleif.data.schema.leidata._2016.LEIRecordType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import reactor.core.publisher.Flux;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

@Slf4j
@RestController
public class CacheService {

    AtomicLong counter = new AtomicLong();
    @Autowired
    private final GleifCache gleifCache;
    private ExecutorService executor = Executors.newCachedThreadPool();


    public CacheService(GleifCache gleifCache) {
        this.gleifCache = gleifCache;
    }


    @GetMapping("/gleif/{lei}")
    public LEIRecordType getLeiRecordType(@PathVariable String lei) {
        //log.info("Count {}", counter.incrementAndGet());
        return gleifCache.get(lei);
    }

    @GetMapping(path = "/all", produces = "application/stream+json")

    public Flux<LegalEntity> getAll() {
        log.info("Calling all");
        ObjectMapper objectMapper = new ObjectMapper();
        //log.info("Count {}", counter.incrementAndGet());
        return Flux.using(

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
                        })
                //.take(10)
                .map(line -> {
                    try {
                        return objectMapper.readValue(line, LEIRecordType.class);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }).map(l -> EntityMapper.ENTITY_MAPPER.map(l, 1, 1));
    }


    @GetMapping(path = "/all1")
    public ResponseEntity<ResponseBodyEmitter> getAll1() {

        log.info("Calling all1");
        ObjectMapper objectMapper = new ObjectMapper();
        //log.info("Count {}", counter.incrementAndGet());
        ResponseBodyEmitter emitter = new ResponseBodyEmitter();
        executor.submit(() -> {

            try (Stream<String> stream = Files.lines(Path.of("/home/nakul/Downloads/20240927-0800-gleif-goldencopy-lei2-golden-copy.xml.json"))) {
                stream.map(line -> {
                    try {
                        return objectMapper.readValue(line, LEIRecordType.class);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }).map(l -> EntityMapper.ENTITY_MAPPER.map(l, 1, 1)).forEach(l -> {
                    try {
                        emitter.send(l);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });

            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                emitter.complete();
            }

        });
        return new ResponseEntity<>(emitter, HttpStatus.OK);

    }
}
