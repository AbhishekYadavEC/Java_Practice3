package model;

import java.time.LocalDate;
import java.util.List;

public class CustomerRegister {
    private int customerId;
    private String customerName;
    private LocalDate dateOfBirth;
    private int contactNumber;
    private String emailAddress;
    private double totalMonthlyExpenses;
    private double monthlyIncome;
    private String profession;
    private String designation;
    private String organizationName;
   private List<LoanAgreement> loanAgreementList;

    public CustomerRegister() {
    }

    public CustomerRegister(String customerName, LocalDate dateOfBirth, int contactNumber, String emailAddress,
                            double totalMonthlyExpenses, double monthlyIncome, String profession, String designation, String organizationName) {
        this.customerName = customerName;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.totalMonthlyExpenses = totalMonthlyExpenses;
        this.monthlyIncome = monthlyIncome;
        this.profession = profession;
        this.designation = designation;
        this.organizationName = organizationName;
    }

    public List<LoanAgreement> getLoanAgreementList() {
        return loanAgreementList;
    }

    public void setLoanAgreementList(List<LoanAgreement> loanAgreementList) {
        this.loanAgreementList = loanAgreementList;
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

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getTotalMonthlyExpenses() {
        return totalMonthlyExpenses;
    }

    public void setTotalMonthlyExpenses(double totalMonthlyExpenses) {
        this.totalMonthlyExpenses = totalMonthlyExpenses;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Override
    public String toString() {
        return "CustomerRegister{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", contactNumber='" + contactNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", totalMonthlyExpenses=" + totalMonthlyExpenses +
                ", monthlyIncome=" + monthlyIncome +
                ", profession='" + profession + '\'' +
                ", designation='" + designation + '\'' +
                ", organizationName='" + organizationName + '\'' +
                ", loanAgreementList=" + loanAgreementList +
                '}';
    }
}
