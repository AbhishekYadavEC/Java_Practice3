package service;

import dao.*;
import model.Customer;
import model.CustomerRegister;
import model.LoanAgreement;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceLayerImp implements ServiceLayer {
    CustomerDao customerDao = new CustomerDaoImp();
    @Override
    public boolean registerCustomer(Customer customer) {
        if(customer.getAge() > 21)
            return customerDao.registerCustomer(customer);
        else
            return false;
    }
    @Override
    public boolean updateCustomer(Customer customer) {
        return customerDao.updateCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(int customerId) {
        return customerDao.deleteCustomer(customerId);
    }

    @Override
    public Customer getCustomer(int customerId) {
        return customerDao.getCustomer(customerId);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    @Override
    public List<Customer> getCustomersByName(String customerName) {
        return customerDao.getCustomersByName(customerName);
    }
    CustomerRegisterDao customerRegister = new CustomerRegisterDaoImp();
    @Override
    public boolean registerCustomer2(CustomerRegister customer) {
        return customerRegister.registerCustomer(customer);
    }
    LoanAgreementDao loanAgreementDao =  new LoanAgreementDaoImp();
    @Override
    public boolean insertloan(LoanAgreement loanAgreement) {
        return loanAgreementDao.insertloan(loanAgreement);}
    public List<CustomerRegister> getDetails(){
        return customerRegister.getDetails();
    }
}

