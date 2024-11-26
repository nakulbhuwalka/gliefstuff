package com.example.gleif.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class LegalEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String lei;
    @Column(length = 1000)
    private String legalName;
    private String legalJurisdiction;
    private String registrationAuthorityID;
    private String registrationAuthorityEntityID;
    private String entityCategory;
    private String entitySubCategory;
    private String entityLegalFormCode;
    private String otherLegalForm;
    //private String associatedEntity;
    private String entityStatus;
    private Date initialRegistrationDate;
    private Date lastUpdateDate;
    private String registrationStatus;
    private Date nextRenewalDate;
    private String managingLOU;
    private String validationSources;
    @OneToMany(mappedBy="legalEntity", cascade = CascadeType.ALL)
    private List<Address> addresses;

    private long asOfDate;
    private long asOfTime;

}
