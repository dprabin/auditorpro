package com.stm.domain.taxpayer.incomesource;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "incomeId", table = "incomesource")
public class WindFallGain extends Incomesource {

    @Override
    public Double getTotalAmount() {
        return (double) 0;
    }
    private Double lottery;
    private Double gift;
    private Double prize;
    private Double baksis;
    private Double awardForWinning;
    private Double other;
}
