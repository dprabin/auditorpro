// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.stm.domain.taxpayer.incomesource.nonbusinesschargable;

import com.stm.domain.taxpayer.incomesource.nonbusinesschargable.BuildingLand;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect BuildingLand_Roo_Jpa_Entity {
    
    declare @type: BuildingLand: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long BuildingLand.id;
    
    @Version
    @Column(name = "version")
    private Integer BuildingLand.version;
    
    public Long BuildingLand.getId() {
        return this.id;
    }
    
    public void BuildingLand.setId(Long id) {
        this.id = id;
    }
    
    public Integer BuildingLand.getVersion() {
        return this.version;
    }
    
    public void BuildingLand.setVersion(Integer version) {
        this.version = version;
    }
    
}
