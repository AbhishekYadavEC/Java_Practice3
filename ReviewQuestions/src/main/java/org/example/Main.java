package org.example;

import model.Product;
import stores.Store;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Store store = new Store ();

        // Register customers
        store.registerCustomer("C1", "John");
        store.registerCustomer("C2", "Alice");
        // Create products
        Product product1 = new Product("P1", "Product 1");
        Product product2 = new Product("P2", "Product 2");
        Product product3 = new Product("P3", "Product 3");
        Product product4 = new Product("P4", "Product 4");

        // Place orders for customers
        List<Product> order1Products = new ArrayList<> ();
        order1Products.add(product1);
        order1Products.add(product2);
        store.placeOrder("C1", "O1", order1Products);

        List<Product> order2Products = new ArrayList<>();
        order2Products.add(product1);
        order2Products.add(product3);
        store.placeOrder("C1", "O2", order2Products);
    }
}