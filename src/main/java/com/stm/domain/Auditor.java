package com.stm.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import com.stm.domain.taxpayer.TaxPayer;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "auditorId", table = "auditor")
public abstract class Auditor extends Person {

    private String legalName;
    private String panNo;
    private Address address;
    private String licenseNo;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<TaxPayer> taxPayers = new HashSet<TaxPayer>();
}
