package com.stm.domain.taxpayer.business.taxfree;
import com.stm.domain.taxpayer.business.TaxFree;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "taxPayerId", table = "taxpayer")
public class PoliticalParty extends TaxFree {
	public Double getTaxRate(){
		return 0.0;
	}
}
