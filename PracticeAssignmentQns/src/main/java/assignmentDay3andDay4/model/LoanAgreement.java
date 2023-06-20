package assignmentDay3andDay4.model;

import java.time.LocalDate;

public class LoanAgreement{
    static int loanAgreementId=0;
    //Generate AgreementId
    public static int counter=0;
    public static  void idGenrator(){
        counter++;
        loanAgreementId=counter;
    }
    LoanProduct loanProduct;
    double loanAmount;
    int tenure;
    double roi;
    LoanStatus loanStatus;
    double emiPerMonth;
    String loanDisbursalDate;
    int repaymentFrequency;

    public LoanAgreement( double loanAmount, int tenure, double roi, LoanStatus loanStatus, double emiPerMonth, String loanDisbursalDate, int repaymentFrequency) {
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.roi = roi;
        this.loanStatus = loanStatus;
        this.emiPerMonth = emiPerMonth;
        this.loanDisbursalDate = loanDisbursalDate;
        this.repaymentFrequency = repaymentFrequency;
    }

    public void calculateEMI(){
        roi = roi / (12 * 100);//one month interest
        tenure = tenure * 12;
        double emi = loanAmount * roi * (float) Math.pow(1 + roi, tenure) / (float) (Math.pow(1 + roi, tenure) - 1);
        System.out.println("Emi:"+emi);
    }

    public void generateRepaymentSchedule(int noOfInstallments, int loanAmount, int rate, int tenure){
        for (int i = 1; i < noOfInstallments; i++) {
            System.out.println("loan amount " + loanAmount + " rate = " + rate + " tenure = " + tenure + " noOfInstallment = " + i);
        }
    }

    public double calculateLatePenalty(LocalDate currentDate){

        double baseRate = 10.0;
        double ratePerDay = 0.05;
        //after 5th of month penalty will start
        int daysLate = currentDate.getDayOfMonth()-1 - 5;
        double penalty = baseRate + (daysLate * ratePerDay);
        return penalty;
    }
    public static double calculateLoanToValueRatio(int loan_amt,double prpValue){
        double ratio = Math.round((loan_amt / prpValue) * 100);
        return ratio;
    }

    @Override
    public String toString() {
        return "LoanAgreement{" +
                "loanProduct=" + loanProduct +
                ", loanAmount=" + loanAmount +
                ", tenure=" + tenure +
                ", roi=" + roi +
                ", loanStatus=" + loanStatus +
                ", emiPerMonth=" + emiPerMonth +
                ", loanDisbursalDate='" + loanDisbursalDate + '\'' +
                ", repaymentFrequency=" + repaymentFrequency +
                '}';
    }
}
