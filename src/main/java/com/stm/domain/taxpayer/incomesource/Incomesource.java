package com.stm.domain.taxpayer.incomesource;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "incomeId", table = "incomesource")
public abstract class Incomesource {

    @NotNull
    private Double totalAmount;
    private String incomeSourceName;
    private String incomeSourceDescription;
}
