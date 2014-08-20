package com.stm.domain.taxpayer;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

import com.stm.domain.taxpayer.incomesource.*;

@RooJavaBean
@RooToString
@RooJpaEntity
public class IncomeSourceFactory {

	// use getIncomeSource method to get object of type IncomeSource
	public Incomesource getIncomeSource(String incomeSourceType) {
		if (incomeSourceType == null) {
			return null;
		}
		if (incomeSourceType.equalsIgnoreCase("BUSINESSINCOME")) {
			return new BusinessIncome();
		} else if (incomeSourceType.equalsIgnoreCase("EMPLOYMENT")) {
			return new Employment();
		} else if (incomeSourceType.equalsIgnoreCase("ExemptIncome")) {
			return new ExemptIncome();
		} else if (incomeSourceType.equalsIgnoreCase("NONBUSINESSCHARGABLE")) {
			return new NonBusinessChargable();
		} else if (incomeSourceType.equalsIgnoreCase("INVESTMENT")) {
			return new Investment();
		} else if (incomeSourceType.equalsIgnoreCase("WINDFALLGAIN")) {
			return new WindFallGain();
		}
		return null;
	}
}
