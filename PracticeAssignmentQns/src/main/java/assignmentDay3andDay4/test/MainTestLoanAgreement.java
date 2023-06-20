package assignmentDay3andDay4.test;

import assignmentDay3andDay4.model.Customer;
import assignmentDay3andDay4.model.LoanAgreement;
import assignmentDay3andDay4.model.LoanStatus;

import java.time.LocalDate;
import java.util.Scanner;

import static assignmentDay3andDay4.model.LoanAgreement.calculateLoanToValueRatio;

public class MainTestLoanAgreement {
    public static void main(String[] args) {
        LoanAgreement loanAgreement=new LoanAgreement (40000,4,6, LoanStatus.APPROVED,8000,"12-06-2001",7);

        System.out.println (loanAgreement );
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your desired loan amount.");
        int loanAmt = sc.nextInt();
        System.out.print("Enter your property value.");
        double properteyVal = sc.nextDouble();
        double ltv = calculateLoanToValueRatio(loanAmt, properteyVal);
        if ( ltv <= 80.0)
            System.out.println("Your loan to value or LTV ratio is : " + ltv + " and this is accepted.");
        else {
            System.out.println("Your loan to value of LTV ratio is :" + ltv + " and this is not accepted.");
        }
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
        System.out.println (customer.getCustomerId () );

    }
}
