// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.stm.domain.taxpayer.naturalperson.residency;

import com.stm.domain.taxpayer.naturalperson.residency.Resident;
import javax.persistence.Entity;
import javax.persistence.Table;

privileged aspect Resident_Roo_Jpa_Entity {
    
    declare @type: Resident: @Entity;
    
    declare @type: Resident: @Table(name = "taxpayer");
    
}
