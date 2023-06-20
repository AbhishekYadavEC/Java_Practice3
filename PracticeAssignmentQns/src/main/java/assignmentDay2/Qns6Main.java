package assignmentDay2;

class DBRCalculation{
    public void calculation(){
        int rent=3000;
        int creditCardPayment=5000;
        int carLoanEmi=8000;
        int studentLoanEmi=9000;

        int totalDebit=rent+creditCardPayment+carLoanEmi+studentLoanEmi;
        int monthlyIncome=40000;
        int dbr=(totalDebit*100)/monthlyIncome;
        if(dbr<=20)
            System.out.println ("Loan will be approved" );
        else
            System.out.println ("Loan will be rejected" );
    }

}
public class Qns6Main {
    public static void main(String[] args) {
        DBRCalculation dbrCalculation=new DBRCalculation ();
        dbrCalculation.calculation ();
    }
}
