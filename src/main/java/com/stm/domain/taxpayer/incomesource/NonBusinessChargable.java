package com.stm.domain.taxpayer.incomesource;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

import com.stm.domain.taxpayer.incomesource.nonbusinesschargable.BuildingLand;
import com.stm.domain.taxpayer.incomesource.nonbusinesschargable.Shares;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "incomeId", table = "incomesource")
public class NonBusinessChargable extends Incomesource {

    @Override
    public Double getTotalAmount() {
        return (double) 0;
    }
    
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Shares> shares = new HashSet<Shares>();

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<BuildingLand> buildingLand = new HashSet<BuildingLand>();

    private Double gainLossFromShareSecurity;

    private Double gainLossFromBuildingLand;

    private Double lossTransferredFromOtherBusinessInvestmentsThisYear;

    private Double carriedForwardOfUnrelivedInvestmentFromPreviousYear;

    private Double totalDeductibleLosses;

    private Double netGainsOrLoss;
    
    public Double addDeductibleLosses(){
    	return lossTransferredFromOtherBusinessInvestmentsThisYear + carriedForwardOfUnrelivedInvestmentFromPreviousYear;
    }

    public Double calculateGainLossFromShareSecurity(){
    	Double total =(double) 0;
    	for(Shares share : shares){
    		total += share.getGainOrLoss();
    	}
    	return total;
    }
    public Double calculateGainLossFromBuildingLand(){
    	Double total =(double) 0;
    	for(BuildingLand building : buildingLand){
    		total += building.getGainOrLoss();
    	}
    	return total;
    }
    public Double calculateNetGainsOrLoss(){
    	this.netGainsOrLoss = calculateGainLossFromBuildingLand() + calculateGainLossFromShareSecurity();
    	return netGainsOrLoss;
    }
    public Double calculateTotalDeductibleLoss(){
    	this.totalDeductibleLosses = lossTransferredFromOtherBusinessInvestmentsThisYear + carriedForwardOfUnrelivedInvestmentFromPreviousYear;
    	return totalDeductibleLosses;
    }
    
    //these in dao repository
    public void addShares(Shares e){
    	this.shares.add(e);
    }
    public void addBuildingLand(BuildingLand e){
    	this.buildingLand.add(e);
    }
}
