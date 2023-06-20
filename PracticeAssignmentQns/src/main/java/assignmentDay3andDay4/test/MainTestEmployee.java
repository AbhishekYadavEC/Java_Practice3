package assignmentDay3andDay4.test;

import assignmentDay3andDay4.model.Employee;

public class MainTestEmployee {
    public static void main(String[] args) {
        // Test constructor and toString()
        /*Employee e1 = new Employee(8, "Amit", "Jain", 2500);
        System.out.println(e1); // toString();
        // Test Setters and Getters
        e1.setSalary(999);
        System.out.println(e1); // toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFistName ());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());
        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary()); // Testmethod
        // Test raiseSalary()
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
*/
        Employee employee=Employee.getInstance ();
        Employee employee1=Employee.getInstance ();
        Employee employee2=Employee.getInstance ();
        Employee employee3=Employee.getInstance ();
        Employee employee4=Employee.getInstance ();
        System.out.println (employee );
        System.out.println (employee1 );
        System.out.println (employee2 );
        System.out.println (employee3 );
        System.out.println ( employee4);

    }
}
