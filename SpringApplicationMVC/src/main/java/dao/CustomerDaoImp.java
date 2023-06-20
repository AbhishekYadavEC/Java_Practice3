package dao;

import config.AppConfiguration;
import dataBaseConnection.ConnectionClass;
import model.Customer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Repository
public class CustomerDaoImp implements CustomerDao{
    @Override
    public boolean registerCustomer(Customer customer) {
        try {
            Connection connection = ConnectionClass.getConnection();
            String query = "insert into customer_dtls_16915(customer_Id,customer_Name,age,aadhar) values(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, customer.getCustomerId());
            preparedStatement.setString(2, customer.getCustomerName());
            preparedStatement.setInt(3,customer.getAge());
            preparedStatement.setLong(4, customer.getAadhar());
            return 1 == preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        try {
            Connection connection = ConnectionClass.getConnection();
            String query = "customer_dtls_16915 set customer_Name=?,age=?,aadhar=? where customer_Id=? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setInt(2,customer.getAge());
            preparedStatement.setLong(3, customer.getAadhar());
            preparedStatement.setInt(4, customer.getCustomerId());
            return 1 == preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteCustomer(int customerId) {
        try {
            Connection connection = ConnectionClass.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from customer_dtls_16915 where customer_Id=?");
            preparedStatement.setInt(1, customerId);
            return 1 == preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    @Override
    public Customer getCustomer(int customerId) {
        try {
            Connection connection = ConnectionClass.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from customer_dtls_16915 where customer_Id=?");
            preparedStatement.setInt(1, customerId);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

            Customer customer = new Customer();
            customer.setCustomerId(resultSet.getInt(1));
            customer.setCustomerName(resultSet.getString(2));
            customer.setAge(resultSet.getInt(3));
            customer.setAadhar(resultSet.getLong(4));
            return customer;
        } catch (SQLException e) {
            try {
                throw new CustomerNotFoundException("No customer found with id = " + customerId);
            } catch (CustomerNotFoundException ex) {
                System.out.println(ex);
            }
        }
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        try {
            Connection connection = ConnectionClass.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from  customer_dtls_16915");
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setCustomerId(resultSet.getInt(1));
                customer.setCustomerName(resultSet.getString(2));
                customer.setAge(resultSet.getInt(3));
                customer.setAadhar(resultSet.getLong(4));
                customers.add(customer);
            }
            return customers;
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }


    @Override
    public List<Customer> getCustomersByName(String customerName) {
        List<Customer> customers = new ArrayList<>();
        try {
            Connection connection = ConnectionClass.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("Select * from customer_dtls_16915 where customer_name=?");
            preparedStatement.setString(1, customerName);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer;
            while (resultSet.next()) {
                 customer = new Customer();
                customer.setCustomerId(resultSet.getInt(1));
                customer.setCustomerName(resultSet.getString(2));
                customer.setAge(resultSet.getInt(3));
                customer.setAadhar(resultSet.getLong(4));
                customers.add(customer);
            }
            return customers;
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}

