package com.stm.domain;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "abstractId", table = "address")
public class Address {

    @NotNull
    private String houseNoBlockNo;
    private String streetTole;
    private String wardNo;
    private String villageArea;
    private String typeOfVDCNP;
    private String district;
    private String zoneState;
}
