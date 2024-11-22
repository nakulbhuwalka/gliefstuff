package com.example.gleif.entity;


import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Entity {
    private long id;
    private String lei;
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
    private List<Address> addresses;

}
