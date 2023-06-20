package assignmentDay3andDay4.model;

public class Employee {
    public static Employee employee;
    public static int objectCount=0;
    public Employee(){
        objectCount++;
    }
    public static synchronized Employee getInstance(){
        if(objectCount<3){
            employee=new Employee (  );
        }else
            employee=null;
        return employee;
    }
    int id;
    String fistName;
    String lastName;
    int salary;

    public Employee(int id, String fistName, String lastName, int salary) {

        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getFistName(){
        return fistName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return fistName+" "+lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        salary=salary*(percent+100)/100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
