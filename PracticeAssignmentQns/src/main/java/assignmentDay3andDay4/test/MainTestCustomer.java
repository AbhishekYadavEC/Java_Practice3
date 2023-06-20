package assignmentDay3andDay4.test;

import assignmentDay3andDay4.model.Customer;

import java.time.LocalDate;

public class MainTestCustomer {
    public static void main(String[] args) {
        // Create a new Customer instance
        Customer customer = new Customer(
                "John Doe",               // customerName
                LocalDate.of(1990, 5, 15), // dateOfBirth
                "1234567890",             // contactNumber
                "johndoe@example.com",    // emailAddress
                5000,                     // monthlyIncome
                "Engineer",               // profession
                2000,                     // totalMonthlyExpenses
                0,                        // maxEligibleLoanAmount (initially 0)
                "Software Developer",      // designation
                "ABC Company"             // companyName
        );
        Customer customer1 = new Customer(
                "John Doe",               // customerName
                LocalDate.of(1990, 5, 15), // dateOfBirth
                "1234567890",             // contactNumber
                "johndoe@example.com",    // emailAddress
                5000,                     // monthlyIncome
                "Engineer",               // profession
                2000,                     // totalMonthlyExpenses
                0,                        // maxEligibleLoanAmount (initially 0)
                "Software Developer",      // designation
                "ABC Company"             // companyName
        );

        // Calculate the eligible loan amount
        customer.calculateELigibleLoanAmount();

        // Print the customer details and the calculated maximum eligible loan amount
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Date of Birth: " + customer.getDateOfBirth());
        System.out.println("Contact Number: " + customer.getContactNumber());
        System.out.println("Email Address: " + customer.getEmailAddress());
        System.out.println("Monthly Income: $" + customer.getMonthlyIncome());
        System.out.println("Profession: " + customer.getProfession());
        System.out.println("Total Monthly Expenses: $" + customer.getTotalMonthlyExpenses());
        System.out.println("Designation: " + customer.getDesignation());
        System.out.println("Company Name: " + customer.getCompanyName());
        System.out.println("Max Eligible Loan Amount: $" + customer.getMaxEligibleLoanAmount());

    }
}
