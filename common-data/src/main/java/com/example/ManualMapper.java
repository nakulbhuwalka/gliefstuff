package com.example;

import com.example.gleif.entity.Entity;
import org.gleif.data.schema.leidata._2016.EntityType;
import org.gleif.data.schema.leidata._2016.LEIRecordType;

public class ManualMapper {

    public static Entity map(LEIRecordType leiRecordType)
    {
        Entity entity = new Entity();
        entity.setLei(leiRecordType.getLEI());
        EntityType gleifEntity = leiRecordType.getEntity();

        entity.setLegalName(gleifEntity.getLegalName().getValue());
        entity.setLegalJurisdiction(gleifEntity.getLegalJurisdiction());
        entity.setRegistrationAuthorityEntityID(gleifEntity.getRegistrationAuthority().getRegistrationAuthorityEntityID());
        entity.setRegistrationAuthorityID(gleifEntity.getRegistrationAuthority().getRegistrationAuthorityID());
        entity.setEntityCategory(gleifEntity.getEntityCategory().value());
        //entity.setEntitySubCategory(gleifEntity.getEntitySubCategory());

        return entity;
    }

}
