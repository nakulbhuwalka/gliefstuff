package com.example.jpa_save;

import com.example.gleif.entity.LegalEntity;
import lombok.extern.slf4j.Slf4j;
import org.gleif.data.schema.leidata._2016.LEIRecordType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LegalEntityService {

    @Autowired
    private final LegalEntityRepository legalEntityRepository;

    public LegalEntityService(LegalEntityRepository legalEntityRepository) {
        this.legalEntityRepository = legalEntityRepository;
    }

    @GetMapping("/gleif/{lei}")
    public LegalEntity getLeiRecordType(@PathVariable String lei) {
        //log.info("Count {}", counter.incrementAndGet());
        return legalEntityRepository.findByLei(lei);
    }
}
