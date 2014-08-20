package com.stm.domain.taxpayer.incomesource.nonbusinesschargable;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
public class Shares {

    private String nameOfEntity;

    private String disposalProcedure;

    private Double noOfDisposedShares;

    private Double marketValueOfShares;

    private Double incomingsFromDisposal;

    private Double outgoingsForDisposal;

    private Double gainOrLoss;

    private String nameOfNewOwner;

    private String addressOfNewOwner;

    private String panOfNewOwner;

    private Boolean transferWithinThreeGeneration;

    public Double addGainOrLoss() {
        return incomingsFromDisposal - outgoingsForDisposal;
    }

}
