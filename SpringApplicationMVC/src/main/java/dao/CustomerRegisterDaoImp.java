package dao;

import assignmentDay19.ConnectionClass;
import model.CustomerRegister;
import model.LoanAgreement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRegisterDaoImp implements CustomerRegisterDao{
    @Override
    public boolean registerCustomer(CustomerRegister customer) {
        try (PreparedStatement preparedStatement = ConnectionClass.getConnection().prepareStatement("Insert into customer_register_16916(customerName,dateOfBirth, contactNumber,emailAddress,totalMonthlyExpenses,monthlyIncome,profession,designation,organizationName ) values(?,?,?,?,?,?,?,?,?)",new String[]{"customerId"})){
            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setDate(2, Date.valueOf(customer.getDateOfBirth()));
            preparedStatement.setLong(3, customer.getContactNumber());
            preparedStatement.setString(4, customer.getEmailAddress());
            preparedStatement.setDouble(5, customer.getTotalMonthlyExpenses());
            preparedStatement.setDouble(6, customer.getMonthlyIncome());
            preparedStatement.setString(7, customer.getProfession());
            preparedStatement.setString(8, customer.getDesignation());
            preparedStatement.setString(9, customer.getOrganizationName());
            preparedStatement.executeUpdate();
            ResultSet keys = preparedStatement.getGeneratedKeys();
            keys.next();
            customer.setCustomerId(keys.getInt(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<CustomerRegister> getDetails() {
        List<CustomerRegister> customers = new ArrayList<>();
        try (PreparedStatement preparedStatement = ConnectionClass.getConnection().prepareStatement("select * from customer_register_16931 c full join loanagreement_16931 l on c.customerId = l.customerId ")) {
            ResultSet resultSet = preparedStatement.executeQuery();
            CustomerRegister customer=new CustomerRegister();
            LoanAgreement loanAgreement=null;
            List<LoanAgreement> loanAgreementList=new ArrayList<>();
            while (resultSet.next()){
                if (customer.getCustomerId() != resultSet.getInt(1)){
                    customer.setLoanAgreementList(loanAgreementList);
                    loanAgreementList.clear();
                    customers.add(customer);
                    customer = new CustomerRegister();
                    customer.setCustomerId(resultSet.getInt(1));
                    customer.setCustomerName(resultSet.getString(2));
                    customer.setDateOfBirth(resultSet.getDate(3).toLocalDate());
                    customer.setContactNumber(resultSet.getInt(4));
                    customer.setEmailAddress(resultSet.getString(5));
                    customer.setTotalMonthlyExpenses(resultSet.getDouble(6));
                    customer.setMonthlyIncome(resultSet.getInt(7));
                    customer.setProfession(resultSet.getString(8));
                    customer.setDesignation(resultSet.getString(9));
                    customer.setOrganizationName(resultSet.getString(10));
                }
                loanAgreement = new LoanAgreement();
                loanAgreement.setLoanAgreementId(resultSet.getInt(12));
                loanAgreement.setLoanAmount(resultSet.getDouble(13));
                loanAgreement.setTenure(resultSet.getInt(14));
                loanAgreement.setRoi(resultSet.getDouble(15));
                loanAgreement.setLoanAgreementDate(resultSet.getDate(16).toLocalDate());
                loanAgreementList.add(loanAgreement);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customers;
    }


}
