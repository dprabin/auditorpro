package com.stm.domain.taxpayer.incomesource;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "incomeId", table = "incomesource")
public class Investment extends Incomesource {

    @Override
    public Double getTotalAmount() {
        return this.totalIncomeOrLossFromInvestment;
    }

    private Double dividends;
    private Double gainFromInvestmentInsuranceOtherThanFinalWithholding;
    private Double interestsOtherThanFinalWithholding;
    private Double rentOtherThanFinalWithholding;
    private Double pymentForNaturalResourceOtherThanFinalWithholding;
    private Double royalties;
    private Double unapprovedRetirementFundOtherThanWithholding;
    private Double disposalOfDepreciableAssets;
    private Double giftsReveivedByPersonInRespectOfInvestment;
    private Double retirementPaymentAlongWithPaymentsRetirementContributions;
    private Double amountsDerivedAsConsiderationForAcceptingRestrictionOfInvestment;
    private Double amountsIncludedByReasonOfTiming;
    private Double excessAmountReceivedByReasonOfExchangeRate;
    private Double recoveredAmountOfBadDebtsDeductedEarlier;
    private Double differenceOfActualInterestAndInterestAsPerMarketRate;
    private Double amountsPaidToThirdPersonInsteadOfActualPayee;
    private Double amountsDerivedFromJointOwnershipInvestment;
    private Double amountsDerivedAsCompensation;
    private Double otherAmountsIncludedInProfitAndGains;
    private Double totalOfAbove19Rows;
    private Double Interest;
    private Double repairsAndImprovements;
    private Double depreciation;
    private Double otherDeductibleExpenses;
    private Double totalDeductibleExpenses;
    private Double lossesTransferredFromOtherBusinessOrInvestment;
    private Double carriedForwardOfUnrelivedBusinessLosses;
    private Double totalDeductibleLoses;
    private Double totalDeductions;
    private Double incomeOrLossFromInvestment;
    private Double lossTransferredToOtherInvestmentIncome;
    private Double totalIncomeOrLossFromInvestment;
}
