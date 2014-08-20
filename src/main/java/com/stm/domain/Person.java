package com.stm.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
public abstract class Person {

    private Address address;
    private String legalName;
    private String panNo;
    private String iroName;
    //private String Sex
}
