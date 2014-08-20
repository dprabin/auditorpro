package com.stm.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "userId", table = "users")
public class Users {

    private String userID;
    private String userName;
    private String password;
    private String lastLogon;
    private String userGroup;
    private String email;
}
