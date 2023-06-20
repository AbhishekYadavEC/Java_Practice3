package dao;

import model.Customer;

import java.util.List;

public interface CustomerDao {
    boolean registerCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(int customer);
    Customer getCustomer(int customerId);
    List<Customer> getAllCustomers();
    List<Customer> getCustomersByName(String customerName);
}
