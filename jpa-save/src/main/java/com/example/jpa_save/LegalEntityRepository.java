package com.example.jpa_save;

import com.example.gleif.entity.LegalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegalEntityRepository extends JpaRepository<LegalEntity,Long> {
}
