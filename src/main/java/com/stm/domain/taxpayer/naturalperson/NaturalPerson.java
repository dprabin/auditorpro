package com.stm.domain.taxpayer.naturalperson;
import com.stm.domain.Person;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "taxPayerId", table = "taxpayer")
public abstract class NaturalPerson extends Person {
	//private String sex; //add to log
}
