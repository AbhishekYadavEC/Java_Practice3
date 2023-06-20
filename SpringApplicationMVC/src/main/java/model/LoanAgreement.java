package model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class LoanAgreement {
    private int loanAgreementId;
    private int customerId;
    private double loanAmount;
    private int tenure;
    private double roi;
    private double emiPerMonth;
    private LocalDate loanAgreementDate;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    Date date2 = null;

    public LoanAgreement() {
    }

    public LoanAgreement(int loanAgreementId, int customerId, double loanAmount,
                         int tenure, double roi, double emiPerMonth, LocalDate loanAgreementDate) {
        this.loanAgreementId = loanAgreementId;
        this.customerId = customerId;
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.roi = roi;
        this.emiPerMonth = emiPerMonth;
        this.loanAgreementDate = loanAgreementDate;
    }
    static void calculateEMI() {
        double loanAmount = 40000;
        double rateOfInterest = 10;
        int tenure = 7; // in years
        int installmentsPerYear = 12;
        double ratePerInstallment = rateOfInterest / (12 * 100);
        int totalInstallments = tenure * installmentsPerYear;
        double installmentAmount = (loanAmount * ratePerInstallment) / (1 - Math.pow(1 + ratePerInstallment, -totalInstallments));
        System.out.println("Loan installment amount: " + installmentAmount);
    }
    public static void generateRepaymentSchedule() {
        double loanAmount = 400000;
        double rateOfInterest = 10;
        int tenure = 7;
        int installmentsPerYear = 12;
        double ratePerInstallment = rateOfInterest / (12 * 100);
        int totalInstallments = tenure * installmentsPerYear; //12*2 = 24
        double installmentAmount = (loanAmount * ratePerInstallment) / (1 - Math.pow(1 + ratePerInstallment, -totalInstallments));
        double outstandingPrincipal = loanAmount;
        System.out.println("Installment Number\tOpening Balance\t\t\t\tInterest\t\t\t\tPrincipal\t\t\t\tInstallment");
        for (int i = 1; i <= totalInstallments; i++) {
            double interest = outstandingPrincipal * (ratePerInstallment);
            double principal = installmentAmount - interest;
            outstandingPrincipal -= principal;
            System.out.println(i + "\t\t\t" + outstandingPrincipal + "\t\t" + interest + "\t\t" + principal + "\t\t" + installmentAmount);
        }
    }

    public static double calculateLatePenalty(LocalDate currentDate) {
        double baseRate = 10.0;
        double ratePerDay = 0.05;
        int daysLate = 15;
        double penalty = baseRate + (daysLate * ratePerDay);
        return 0.0;
    }
    public static double calulateLoanToValue(long loanAmountt, double propertyValue) {
        return Math.round((propertyValue/loanAmountt) * 100);
    }


    public int getLoanAgreementId() {
        return loanAgreementId;
    }

    public void setLoanAgreementId(int loanAgreementId) {
        this.loanAgreementId = loanAgreementId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public double getEmiPerMonth() {
        return emiPerMonth;
    }

    public void setEmiPerMonth(double emiPerMonth) {
        this.emiPerMonth = emiPerMonth;
    }

    public LocalDate getLoanAgreementDate() {
        return loanAgreementDate;
    }

    public void setLoanAgreementDate(LocalDate loanAgreementDate) {
        this.loanAgreementDate = loanAgreementDate;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }
}
