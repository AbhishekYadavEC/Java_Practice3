package model;

import java.util.ArrayList;
import java.util.List;


public class Order {
    public String orderId;
    public List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<> ();
    }

    public String getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
