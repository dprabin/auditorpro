// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.stm.domain;

import com.stm.domain.Users;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

privileged aspect Users_Roo_Jpa_Entity {
    
    declare @type: Users: @Entity;
    
    declare @type: Users: @Table(name = "users");
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private Long Users.userId;
    
    @Version
    @Column(name = "version")
    private Integer Users.version;
    
    public Long Users.getUserId() {
        return this.userId;
    }
    
    public void Users.setUserId(Long id) {
        this.userId = id;
    }
    
    public Integer Users.getVersion() {
        return this.version;
    }
    
    public void Users.setVersion(Integer version) {
        this.version = version;
    }
    
}
