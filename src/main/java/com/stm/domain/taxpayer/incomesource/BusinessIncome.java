package com.stm.domain.taxpayer.incomesource;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "incomeId", table = "incomesource")
public class BusinessIncome extends Incomesource {

    @Override
    public Double getTotalAmount() {
        return this.totalIncomeOrLossFromBusiness;
    }
    
    //remove this as this is not required 
    public BusinessIncome(){
    	this.lossTransferredToOtherBusiness = (double) 0;
    }
    
    //from all these create new getter to return and set void return type for all;
    public Double calculateTotalInclusions(){
    	this.totalInclusions = serviceFees + amountsDerivedFromDisposalOfTradingStock + netGainsFromDisposalOfPersonBusinessAssets + amountsTreatedAsDerivedFromDepreciableAssets + giftsReceivedByThePersonInRespect + amountsDerivedAsConsiderationForAcceptingRestrictionOnCapacityToConductBusiness + amountsDerivedFromInvestmentsEffectivelyConnectedWithBusiness + amountsIncludedByReasonOfChangeInAccountingSystem + amountsIncludedByReasonOfTiming + excessAmountReceivedByReasonOfExchangeRate + recoveredAmountOfBadDebtsDeductedEarlier + amountsIncludedAsPerContractOfCompletionBasis + differenceOfActualInterestAndInterestAsPerMarketRate + amountsPaidToThirdPerson + amountsDerivedAsCompensation + otherAmountsIncludedInProfitAndGains;
    	return this.totalInclusions;
    }
    public Double calculateTotalDeductibleExpenses(){
    	this.totalDeductibleExpense = interest + costOfTradingStocks + repairsAndImprovements + pollutionControl + researchAndDevelopment + depreciation + deductibleReserve + otherDeductibleExpense + taxPaidOutsideNepal;
    	return this.totalDeductibleExpense;
    }
    public Double calculateTotalDeductibleLoss(){
    	this.totalDeductibleLoss = losesTransferredFromOtherBusiness + carriedForwardOfUnrelievedLosses;
    	return this.totalDeductibleLoss;
    }
    public Double calculateTotalDeductions(){
    	this.totalDeduction = this.totalDeductibleExpense + this.totalDeductibleLoss;
    	return this.totalDeduction;
    }
    public Double calculateIncomeOrLossFromBusiness(){
    	this.incomeOrLossFromBusiness = this.totalInclusions - this.totalDeduction;
    	return this.incomeOrLossFromBusiness;
    }
    
    //this function always return positive or 0 
    public Double calculateLossTransferredToOtherBusiness(){
    	if(this.incomeOrLossFromBusiness<0){
        	this.lossTransferredToOtherBusiness = abs(this.incomeOrLossFromBusiness);
    	} else {
    		this.lossTransferredToOtherBusiness = (double) 0;
    	}
    	return this.lossTransferredToOtherBusiness;
    }
    public Double calculateTotalIncomeOrLossFromBusiness(){
    	return this.lossTransferredToOtherBusiness + this.incomeOrLossFromBusiness;
    }

    private Double serviceFees;
    private Double amountsDerivedFromDisposalOfTradingStock;
    private Double netGainsFromDisposalOfPersonBusinessAssets;
    private Double amountsTreatedAsDerivedFromDepreciableAssets;
    private Double giftsReceivedByThePersonInRespect;
    private Double amountsDerivedAsConsiderationForAcceptingRestrictionOnCapacityToConductBusiness;
    private Double amountsDerivedFromInvestmentsEffectivelyConnectedWithBusiness;
    private Double amountsIncludedByReasonOfChangeInAccountingSystem;
    private Double amountsIncludedByReasonOfTiming;
    private Double excessAmountReceivedByReasonOfExchangeRate;
    private Double recoveredAmountOfBadDebtsDeductedEarlier;
    private Double amountsIncludedAsPerContractOfCompletionBasis;
    private Double differenceOfActualInterestAndInterestAsPerMarketRate;
    private Double amountsPaidToThirdPerson;
    private Double amountsDerivedAsCompensation;
    private Double otherAmountsIncludedInProfitAndGains;
    private Double totalInclusions;//subtotal
    private Double interest;
    private Double costOfTradingStocks;
    private Double repairsAndImprovements;
    private Double pollutionControl;
    private Double researchAndDevelopment;
    private Double depreciation;
    private Double deductibleReserve;
    private Double otherDeductibleExpense;
    private Double taxPaidOutsideNepal;
    private Double totalDeductibleExpense;//subtotal
    private Double losesTransferredFromOtherBusiness;
    private Double carriedForwardOfUnrelievedLosses;
    private Double totalDeductibleLoss;//subtotal
    private Double totalDeduction;//subtotal
    private Double incomeOrLossFromBusiness;//Cannot Understand and should be clear
    private Double lossTransferredToOtherBusiness;
    private Double totalIncomeOrLossFromBusiness;//total
}
