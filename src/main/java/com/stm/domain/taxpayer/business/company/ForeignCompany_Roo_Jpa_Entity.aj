// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.stm.domain.taxpayer.business.company;

import com.stm.domain.taxpayer.business.company.ForeignCompany;
import javax.persistence.Entity;
import javax.persistence.Table;

privileged aspect ForeignCompany_Roo_Jpa_Entity {
    
    declare @type: ForeignCompany: @Entity;
    
    declare @type: ForeignCompany: @Table(name = "taxpayer");
    
}
