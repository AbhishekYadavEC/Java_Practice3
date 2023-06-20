package assignmentDay3andDay4.model;

import java.time.LocalDate;

public class Customer {
    static int customerId=0;
    String customerName;
    LocalDate dateOfBirth;
    String contactNumber;
    String emailAddress;
    double monthlyIncome;
    String profession;
    double totalMonthlyExpenses;
    double maxEligibleLoanAmount;
    String designation;
    String companyName;
    static int counter=0;
    //Here we will count object of customer
    /*public int display(){
        return counter;
    }*/

    //Here we will generate CustomerId
    public static void createId(){
        counter++;
        customerId=counter;
    }

    public Customer( String customerName, LocalDate dateOfBirth, String contactNumber, String emailAddress, double monthlyIncome, String profession, double totalMonthlyExpenses, double maxEligibleLoanAmount, String designation, String companyName) {
        this.customerName = customerName;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.monthlyIncome = monthlyIncome;
        this.profession = profession;
        this.totalMonthlyExpenses = totalMonthlyExpenses;
        this.maxEligibleLoanAmount = maxEligibleLoanAmount;
        this.designation = designation;
        this.companyName = companyName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public double getTotalMonthlyExpenses() {
        return totalMonthlyExpenses;
    }

    public void setTotalMonthlyExpenses(double totalMonthlyExpenses) {
        this.totalMonthlyExpenses = totalMonthlyExpenses;
    }

    public double getMaxEligibleLoanAmount() {
        return maxEligibleLoanAmount;
    }

    public void setMaxEligibleLoanAmount(double maxEligibleLoanAmount) {
        this.maxEligibleLoanAmount = maxEligibleLoanAmount;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double calculateDBR(){
        return totalMonthlyExpenses/monthlyIncome;
    }
    public double calculateMaxELigibleEMI(){
        return monthlyIncome * 0.5 * (1 - 0.2);
    }
    public void calculateELigibleLoanAmount(){

        double maxEligibleEMI = calculateMaxELigibleEMI ();
        double dbr = calculateDBR();

        // Calculate the maximum eligible loan amount based on EMI and DBR
        maxEligibleLoanAmount = maxEligibleEMI * 12 / (dbr * 0.8);
    }
}
