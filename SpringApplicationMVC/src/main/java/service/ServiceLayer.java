package service;

import model.Customer;
import model.CustomerRegister;
import model.LoanAgreement;

import java.util.List;

public interface ServiceLayer {
    boolean registerCustomer(Customer customer);
    boolean registerCustomer2(CustomerRegister customer);

    boolean updateCustomer(Customer customer);

    boolean deleteCustomer(int customerId);

    Customer getCustomer(int customerId);

    List<Customer> getAllCustomers();

    List<Customer> getCustomersByName(String customerName);
    public boolean insertloan(LoanAgreement loanAgreement);
}
