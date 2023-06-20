package dao;

import model.Customer;
import model.CustomerRegister;

import java.util.List;

public interface CustomerRegisterDao {
    boolean registerCustomer(CustomerRegister customer);
    List<CustomerRegister> getDetails();

}
