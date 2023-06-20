package model;

import java.time.LocalDate;

public class Customer {
    private int customerId;
    private String customerName;
    private int age;
    private long aadhar;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getAadhar() {
        return aadhar;
    }

    public void setAadhar(long aadhar) {
        this.aadhar = aadhar;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", age=" + age +
                ", aadhar=" + aadhar +
                '}';
    }
}
