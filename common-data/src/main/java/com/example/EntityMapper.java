package com.example;

import com.example.gleif.entity.Address;
import com.example.gleif.entity.Entity;
import org.gleif.data.schema.leidata._2016.AddressType;
import org.gleif.data.schema.leidata._2016.LEIRecordType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;

@Mapper
public interface EntityMapper {

    EntityMapper ENTITY_MAPPER = Mappers.getMapper(EntityMapper.class);

    @Mapping(target = "lei", source = "LEI")
    @Mapping(target = "legalName", source = "entity.legalName.value")
    @Mapping(target = "legalJurisdiction", source = "entity.legalJurisdiction")
    @Mapping(target = "registrationAuthorityID", source = "entity.registrationAuthority.registrationAuthorityID")
    @Mapping(target = "registrationAuthorityEntityID", source = "entity.registrationAuthority.registrationAuthorityEntityID")
    @Mapping(target = "entityCategory", source = "entity.entityCategory")
    @Mapping(target = "entitySubCategory", source = "entity.entitySubCategory")
    @Mapping(target = "entityLegalFormCode", source = "entity.legalForm.entityLegalFormCode")
    @Mapping(target = "otherLegalForm", source = "entity.legalForm.otherLegalForm")
    @Mapping(target = "entityStatus", source = "entity.entityStatus")
    @Mapping(target = "initialRegistrationDate", source = "registration.initialRegistrationDate")
    @Mapping(target = "lastUpdateDate", source = "registration.lastUpdateDate")
    @Mapping(target = "registrationStatus", source = "registration.registrationStatus")
    @Mapping(target = "nextRenewalDate", source = "registration.nextRenewalDate")
    @Mapping(target = "managingLOU", source = "registration.managingLOU")
    @Mapping(target = "validationSources", source = "registration.validationSources")
    Entity lEIRecordTypeToEntity(LEIRecordType leiRecordType);



    Address addressTypeToAddress(AddressType addressType, String type);

    default Entity map(LEIRecordType leiRecordType)
    {
        Entity entity = lEIRecordTypeToEntity(leiRecordType);
        entity.setAddresses(new ArrayList<>());

        entity.getAddresses().add(addressTypeToAddress(leiRecordType.getEntity().getLegalAddress(), "legal"));
        entity.getAddresses().add(addressTypeToAddress(leiRecordType.getEntity().getHeadquartersAddress(),"hq"));

        return entity;
    }

}