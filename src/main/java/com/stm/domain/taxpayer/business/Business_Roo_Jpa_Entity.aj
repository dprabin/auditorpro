// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.stm.domain.taxpayer.business;

import com.stm.domain.taxpayer.business.Business;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

privileged aspect Business_Roo_Jpa_Entity {
    
    declare @type: Business: @Entity;
    
    declare @type: Business: @Table(name = "taxpayer");
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "taxPayerId")
    private Long Business.taxPayerId;
    
    @Version
    @Column(name = "version")
    private Integer Business.version;
    
    public Long Business.getTaxPayerId() {
        return this.taxPayerId;
    }
    
    public void Business.setTaxPayerId(Long id) {
        this.taxPayerId = id;
    }
    
    public Integer Business.getVersion() {
        return this.version;
    }
    
    public void Business.setVersion(Integer version) {
        this.version = version;
    }
    
}
