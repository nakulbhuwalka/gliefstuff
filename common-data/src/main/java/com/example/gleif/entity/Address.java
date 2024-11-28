package com.example.gleif.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String firstAddressLine;
    private String addressNumber;
    private String addressNumberWithinBuilding;
    private String mailRouting;
    private String city;
    private String region;
    private String country;
    private String postalCode;
    private String type;
    @ManyToOne
    @JoinColumn(name="legal_entity_id", nullable=false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    private LegalEntity legalEntity;
    

}
