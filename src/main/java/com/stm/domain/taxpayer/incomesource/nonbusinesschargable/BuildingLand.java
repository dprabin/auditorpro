package com.stm.domain.taxpayer.incomesource.nonbusinesschargable;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
public class BuildingLand {

    private String addressOfBuildingOrLand;

    private String disposalProceduce;

    private Double marketValue;

    private Double incomingsFromDisposal;

    private Double outgoingsForDisposal;

    private Double gainOrLoss;

    private String nameOfNewOwner;

    private String addressOfNewOwner;

    private String panOfNewOwner;

    private Boolean transferWithinThreeGeneration;

    private Boolean lessThanOneRopani;

    private Boolean salesValueLessThanThirtyLakh;

    private Boolean ownedOrResidentLessThanTenYear;

    Double addGainOrLoss() {
        return incomingsFromDisposal - outgoingsForDisposal;
    }

}
