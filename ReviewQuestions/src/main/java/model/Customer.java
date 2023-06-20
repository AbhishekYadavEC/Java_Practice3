package model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String customerId;
    public String name;
    public List<Order> orders;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<> ();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
