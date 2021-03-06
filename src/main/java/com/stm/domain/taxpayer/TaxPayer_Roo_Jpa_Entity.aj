// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.stm.domain.taxpayer;

import com.stm.domain.taxpayer.TaxPayer;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

privileged aspect TaxPayer_Roo_Jpa_Entity {
    
    declare @type: TaxPayer: @Entity;
    
    declare @type: TaxPayer: @Table(name = "taxpayer");
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "taxPayerId")
    private Long TaxPayer.taxPayerId;
    
    @Version
    @Column(name = "version")
    private Integer TaxPayer.version;
    
    public Long TaxPayer.getTaxPayerId() {
        return this.taxPayerId;
    }
    
    public void TaxPayer.setTaxPayerId(Long id) {
        this.taxPayerId = id;
    }
    
    public Integer TaxPayer.getVersion() {
        return this.version;
    }
    
    public void TaxPayer.setVersion(Integer version) {
        this.version = version;
    }
    
}
