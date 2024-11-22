package com.example.gleif.entity;

import lombok.Data;

@Data
public class Address {

    private long id;
    private String firstAddressLine;
    private String addressNumber;
    private String addressNumberWithinBuilding;
    private String mailRouting;
    private String city;
    private String region;
    private String country;
    private String postalCode;
    private String type;
    

}
