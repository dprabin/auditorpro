package com.stm.domain.taxpayer.incomesource;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "incomeId", table = "incomesource")
public class Employment extends Incomesource {

    @Override
    public Double getTotalAmount() {
        return this.total;
    }
    public Double calculateTotal(){
    	this.total = salaryWages + leavePay + overtimePayment + fees + prizesGifts + bonuses + paymentForOtherFacilitations + commissions + dearnessAllowances + costOfLivingAllowances + rentAllowances + entertainmnetTransportationAllowances + otherPersonalAllowances + dischargeOrReimbursementsOfPersonalCosts + paymentToAgreementToAnyConditionsOfEmployment + paymentForRedundancyOrLossOrTerminationOfEmployment + retirementContributionsAndRetirementPayments + otherPaymentsMadeInRespectOfEmployment + fringeBenefitForVehicleFacility + fringeBenefitForHouseFacility + fringeBenefitForHousekeeperOrDomesticAssistant + fringeBenefitForRefreshmentEntertainment + fringeBenefitForWaterElectricityTelephoneUtilities + differenceOfActualInterestAndInterestAsPerMarketRate + otherAmountsIncludedInRemuneration;
    	return total;
    }
    private Double salaryWages;
    private Double leavePay;
    private Double overtimePayment;
    private Double fees;
    private Double prizesGifts;
    private Double bonuses;
    private Double paymentForOtherFacilitations;
    private Double commissions;
    private Double dearnessAllowances;
    private Double costOfLivingAllowances;
    private Double rentAllowances;
    private Double entertainmnetTransportationAllowances;
    private Double otherPersonalAllowances;
    private Double dischargeOrReimbursementsOfPersonalCosts;
    private Double paymentToAgreementToAnyConditionsOfEmployment;
    private Double paymentForRedundancyOrLossOrTerminationOfEmployment;
    private Double retirementContributionsAndRetirementPayments;
    private Double otherPaymentsMadeInRespectOfEmployment;
    private Double fringeBenefitForVehicleFacility;
    private Double fringeBenefitForHouseFacility;
    private Double fringeBenefitForHousekeeperOrDomesticAssistant;
    private Double fringeBenefitForRefreshmentEntertainment;
    private Double fringeBenefitForWaterElectricityTelephoneUtilities;
    private Double differenceOfActualInterestAndInterestAsPerMarketRate;
    private Double otherAmountsIncludedInRemuneration;
    private Double total;
}
