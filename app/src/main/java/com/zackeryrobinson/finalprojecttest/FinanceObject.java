package com.zackeryrobinson.finalprojecttest;

/**
 * Created by ios on 10/16/17.
 */

public class FinanceObject {

    String Date_payDate;
    String Date_startDate;
    String Date_endDate;
    String Earning_regularRate;
    String Earning_regularHours;
    String Earning_regularPay;
    String Earning_overtimeRate;
    String Earning_overtimeHours;
    String Earning_overTimePay;
    String Earning_holidayHours;
    String Earning_holidayPay;
    String Earning_ptoHours;
    String Earning_ptoPay;
    String Earning_totalHours;
    String Earning_totalPay;
    String ExpAdv_expenses;
    String ExpAdv_advances;
    String Deduction_federalTax;
    String Deduction_federalTaxYTD;
    String Deduction_stateTax;
    String Deduction_stateTaxYTD;
    String Deduction_socialSecurityTax;
    String Deduction_socialSecurityTaxYTD;
    String Deduction_medicareTax;
    String Deduction_medicareTaxYTD;
    String Deduction_medicareInsurance;
    String Deduction_medicareInsuranceYTD;
    String Deduction_visionInsurance;
    String Deduction_visionInsuranceYTD;
    String Deduction_dentalInsurance;
    String Deduction_dentalInsuranceYTD;
    String Deduction_stdisabilityInsurance;
    String Deduction_stdisabilityInsuranceYTD;
    String Deduction_ltdisabilityInsurance;
    String Deduction_ltdisabilityInsuranceYTD;
    String Deduction_lifeInsurance;
    String Deduction_lifeInsuranceYTD;
    String Deduction_advance;
    String Deduction_advanceYTD;
    String Deduction_totalPay;
    String Deduction_totalPayYTD;
    String Totals_netPay;
    String Totals_grossPayYTD;
    String Totals_netPayYTD;

    public FinanceObject()
    {
        //do we want an object with 40parameters?
        //is there a better way to do this?
    }

    public String getDate_endDate() {
        return Date_endDate;
    }

    public String getDate_payDate() {
        return Date_payDate;
    }

    public String getDate_startDate() {
        return Date_startDate;
    }

    public String getDeduction_dentalInsurance() {
        return Deduction_dentalInsurance;
    }

    public String getDeduction_dentalInsuranceYTD() {
        return Deduction_dentalInsuranceYTD;
    }

    public String getDeduction_advance() {
        return Deduction_advance;
    }

    public String getDeduction_federalTax() {
        return Deduction_federalTax;
    }

    public String getDeduction_advanceYTD() {
        return Deduction_advanceYTD;
    }

    public String getDeduction_federalTaxYTD() {
        return Deduction_federalTaxYTD;
    }

    public String getDeduction_lifeInsurance() {
        return Deduction_lifeInsurance;
    }

    public String getDeduction_ltdisabilityInsurance() {
        return Deduction_ltdisabilityInsurance;
    }

    public String getDeduction_lifeInsuranceYTD() {
        return Deduction_lifeInsuranceYTD;
    }

    public String getDeduction_medicareTax() {
        return Deduction_medicareTax;
    }

    public String getDeduction_socialSecurityTax() {
        return Deduction_socialSecurityTax;
    }

    public String getDeduction_ltdisabilityInsuranceYTD() {
        return Deduction_ltdisabilityInsuranceYTD;
    }

    public String getDeduction_medicareInsurance() {
        return Deduction_medicareInsurance;
    }

    public String getDeduction_medicareInsuranceYTD() {
        return Deduction_medicareInsuranceYTD;
    }

    public String getDeduction_medicareTaxYTD() {
        return Deduction_medicareTaxYTD;
    }

    public String getDeduction_socialSecurityTaxYTD() {
        return Deduction_socialSecurityTaxYTD;
    }

    public String getDeduction_stateTax() {
        return Deduction_stateTax;
    }

    public String getDeduction_stateTaxYTD() {
        return Deduction_stateTaxYTD;
    }

    public String getEarning_holidayHours() {
        return Earning_holidayHours;
    }

    public String getDeduction_stdisabilityInsurance() {
        return Deduction_stdisabilityInsurance;
    }

    public String getDeduction_stdisabilityInsuranceYTD() {
        return Deduction_stdisabilityInsuranceYTD;
    }

    public String getDeduction_totalPay() {
        return Deduction_totalPay;
    }

    public String getEarning_holidayPay() {
        return Earning_holidayPay;
    }

    public String getDeduction_totalPayYTD() {
        return Deduction_totalPayYTD;
    }

    public String getDeduction_visionInsurance() {
        return Deduction_visionInsurance;
    }

    public String getEarning_overtimeHours() {
        return Earning_overtimeHours;
    }

    public String getDeduction_visionInsuranceYTD() {
        return Deduction_visionInsuranceYTD;
    }

    public String getEarning_overTimePay() {
        return Earning_overTimePay;
    }

    public String getEarning_overtimeRate() {
        return Earning_overtimeRate;
    }

    public String getEarning_ptoHours() {
        return Earning_ptoHours;
    }

    public String getEarning_ptoPay() {
        return Earning_ptoPay;
    }

    public String getEarning_regularHours() {
        return Earning_regularHours;
    }

    public String getEarning_regularPay() {
        return Earning_regularPay;
    }

    public String getEarning_regularRate() {
        return Earning_regularRate;
    }

    public String getEarning_totalHours() {
        return Earning_totalHours;
    }

    public String getEarning_totalPay() {
        return Earning_totalPay;
    }

    public String getExpAdv_advances() {
        return ExpAdv_advances;
    }

    public String getExpAdv_expenses() {
        return ExpAdv_expenses;
    }

    public String getTotals_grossPayYTD() {
        return Totals_grossPayYTD;
    }

    public String getTotals_netPay() {
        return Totals_netPay;
    }

    public String getTotals_netPayYTD() {
        return Totals_netPayYTD;
    }

    public void setDate_endDate(String date_endDate) {
        Date_endDate = date_endDate;
    }

    public void setDate_payDate(String date_payDate) {
        Date_payDate = date_payDate;
    }

    public void setDate_startDate(String date_startDate) {
        Date_startDate = date_startDate;
    }

    public void setDeduction_dentalInsurance(String deduction_dentalInsurance) {
        Deduction_dentalInsurance = deduction_dentalInsurance;
    }

    public void setDeduction_federalTax(String deduction_federalTax) {
        Deduction_federalTax = deduction_federalTax;
    }

    public void setDeduction_dentalInsuranceYTD(String deduction_dentalInsuranceYTD) {
        Deduction_dentalInsuranceYTD = deduction_dentalInsuranceYTD;
    }

    public void setDeduction_federalTaxYTD(String deduction_federalTaxYTD) {
        Deduction_federalTaxYTD = deduction_federalTaxYTD;
    }

    public void setDeduction_medicareInsurance(String deduction_medicareInsurance) {
        Deduction_medicareInsurance = deduction_medicareInsurance;
    }

    public void setDeduction_medicareInsuranceYTD(String deduction_medicareInsuranceYTD) {
        Deduction_medicareInsuranceYTD = deduction_medicareInsuranceYTD;
    }

    public void setDeduction_advance(String deduction_advance) {
        Deduction_advance = deduction_advance;
    }

    public void setDeduction_medicareTax(String deduction_medicareTax) {
        Deduction_medicareTax = deduction_medicareTax;
    }

    public void setDeduction_medicareTaxYTD(String deduction_medicareTaxYTD) {
        Deduction_medicareTaxYTD = deduction_medicareTaxYTD;
    }

    public void setDeduction_socialSecurityTax(String deduction_socialSecurityTax) {
        Deduction_socialSecurityTax = deduction_socialSecurityTax;
    }

    public void setDeduction_socialSecurityTaxYTD(String deduction_socialSecurityTaxYTD) {
        Deduction_socialSecurityTaxYTD = deduction_socialSecurityTaxYTD;
    }

    public void setDeduction_stateTax(String deduction_stateTax) {
        Deduction_stateTax = deduction_stateTax;
    }

    public void setDeduction_stateTaxYTD(String deduction_stateTaxYTD) {
        Deduction_stateTaxYTD = deduction_stateTaxYTD;
    }

    public void setDeduction_visionInsurance(String deduction_visionInsurance) {
        Deduction_visionInsurance = deduction_visionInsurance;
    }

    public void setEarning_holidayHours(String earning_holidayHours) {
        Earning_holidayHours = earning_holidayHours;
    }

    public void setEarning_holidayPay(String earning_holidayPay) {
        Earning_holidayPay = earning_holidayPay;
    }

    public void setDeduction_stdisabilityInsurance(String deduction_stdisabilityInsurance) {
        Deduction_stdisabilityInsurance = deduction_stdisabilityInsurance;
    }

    public void setEarning_overtimeHours(String earning_overtimeHours) {
        Earning_overtimeHours = earning_overtimeHours;
    }

    public void setEarning_overTimePay(String earning_overTimePay) {
        Earning_overTimePay = earning_overTimePay;
    }

    public void setDeduction_visionInsuranceYTD(String deduction_visionInsuranceYTD) {
        Deduction_visionInsuranceYTD = deduction_visionInsuranceYTD;
    }

    public void setEarning_overtimeRate(String earning_overtimeRate) {
        Earning_overtimeRate = earning_overtimeRate;
    }

    public void setDeduction_advanceYTD(String deduction_advanceYTD) {
        Deduction_advanceYTD = deduction_advanceYTD;
    }

    public void setEarning_ptoHours(String earning_ptoHours) {
        Earning_ptoHours = earning_ptoHours;
    }

    public void setDeduction_lifeInsurance(String deduction_lifeInsurance) {
        Deduction_lifeInsurance = deduction_lifeInsurance;
    }

    public void setEarning_ptoPay(String earning_ptoPay) {
        Earning_ptoPay = earning_ptoPay;
    }

    public void setEarning_regularHours(String earning_regularHours) {
        Earning_regularHours = earning_regularHours;
    }

    public void setDeduction_lifeInsuranceYTD(String deduction_lifeInsuranceYTD) {
        Deduction_lifeInsuranceYTD = deduction_lifeInsuranceYTD;
    }

    public void setDeduction_stdisabilityInsuranceYTD(String deduction_stdisabilityInsuranceYTD) {
        Deduction_stdisabilityInsuranceYTD = deduction_stdisabilityInsuranceYTD;
    }

    public void setDeduction_ltdisabilityInsurance(String deduction_ltdisabilityInsurance) {
        Deduction_ltdisabilityInsurance = deduction_ltdisabilityInsurance;
    }

    public void setDeduction_ltdisabilityInsuranceYTD(String deduction_ltdisabilityInsuranceYTD) {
        Deduction_ltdisabilityInsuranceYTD = deduction_ltdisabilityInsuranceYTD;
    }

    public void setEarning_regularPay(String earning_regularPay) {
        Earning_regularPay = earning_regularPay;
    }

    public void setEarning_regularRate(String earning_regularRate) {
        Earning_regularRate = earning_regularRate;
    }

    public void setDeduction_totalPay(String deduction_totalPay) {
        Deduction_totalPay = deduction_totalPay;
    }

    public void setEarning_totalHours(String earning_totalHours) {
        Earning_totalHours = earning_totalHours;
    }

    public void setEarning_totalPay(String earning_totalPay) {
        Earning_totalPay = earning_totalPay;
    }

    public void setDeduction_totalPayYTD(String deduction_totalPayYTD) {
        Deduction_totalPayYTD = deduction_totalPayYTD;
    }

    public void setExpAdv_advances(String expAdv_advances) {
        ExpAdv_advances = expAdv_advances;
    }

    public void setExpAdv_expenses(String expAdv_expenses) {
        ExpAdv_expenses = expAdv_expenses;
    }

    public void setTotals_grossPayYTD(String totals_grossPayYTD) {
        Totals_grossPayYTD = totals_grossPayYTD;
    }

    public void setTotals_netPay(String totals_netPay) {
        Totals_netPay = totals_netPay;
    }

    public void setTotals_netPayYTD(String totals_netPayYTD) {
        Totals_netPayYTD = totals_netPayYTD;
    }
}
