package com.stm.domain.taxpayer.naturalperson.residency;
import com.stm.domain.taxpayer.naturalperson.NaturalPerson;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "taxPayerId", table = "taxpayer")
public abstract class Residency extends NaturalPerson {
}
