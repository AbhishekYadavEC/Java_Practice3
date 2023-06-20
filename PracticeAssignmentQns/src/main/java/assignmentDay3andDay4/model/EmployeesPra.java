package assignmentDay3andDay4.model;

class EmployeeDetails{
    private int empId=11332;
    private String empName="Abhishek";
    private int phoneNumber=963788424;
    private char gender='M';

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
public class EmployeesPra {
    public static void main(String[] args) {
        Employee employee=new Employee (  );
        System.out.println ( employee);
    }
}
