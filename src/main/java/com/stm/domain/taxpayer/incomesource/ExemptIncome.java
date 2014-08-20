package com.stm.domain.taxpayer.incomesource;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "incomeId", table = "incomesource")
public class ExemptIncome extends Incomesource {
	@Override
	public Double getTotalAmount() {
		return (double) 0;
	}
}
