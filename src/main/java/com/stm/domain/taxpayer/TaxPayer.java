package com.stm.domain.taxpayer;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "taxPayerId", table = "taxpayer")
public abstract class TaxPayer {
	//this might not be abstract class
	//set of income sources
	//type of taxpayer
	public Double getTaxRate(){
		return 0.25;
	}
}
