// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.stm.domain.taxpayer.incomesource;

import com.stm.domain.taxpayer.incomesource.Incomesource;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

privileged aspect Incomesource_Roo_Jpa_Entity {
    
    declare @type: Incomesource: @Entity;
    
    declare @type: Incomesource: @Table(name = "incomesource");
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "incomeId")
    private Long Incomesource.incomeId;
    
    @Version
    @Column(name = "version")
    private Integer Incomesource.version;
    
    public Long Incomesource.getIncomeId() {
        return this.incomeId;
    }
    
    public void Incomesource.setIncomeId(Long id) {
        this.incomeId = id;
    }
    
    public Integer Incomesource.getVersion() {
        return this.version;
    }
    
    public void Incomesource.setVersion(Integer version) {
        this.version = version;
    }
    
}