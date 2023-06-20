package stores;

import model.Customer;
import model.Order;
import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
    public List<Customer> customers;
    public Map<String, Integer> productOrderCount;

    public Store(List<Customer> customers, Map<String, Integer> productOrderCount) {
        this.customers = new ArrayList<> ();
        this.productOrderCount = new HashMap<> ();
    }

    public void registerCustomer(String customerId,String customerName){
        Customer customer=new Customer (customerId,customerName);
        customers.add (customer);
    }

    private Customer findCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    public void placeOrder(String customerId, String orderId, List<Product> products) {
        Customer customer = findCustomer(customerId);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        Order order = new Order(orderId);
        order.getProducts().addAll(products);
        //customer.addOrder(order);

        updateProductOrderCount(products);
    }

    private void updateProductOrderCount(List<Product> products) {
        for (Product product : products) {
            String productId = product.getProductId();
            int count = productOrderCount.getOrDefault(productId, 0);
            productOrderCount.put(productId, count + 1);
        }
    }

    public double getTotalPayableAmount(String customerId) {
        Customer customer = findCustomer(customerId);
        if (customer == null) {
            System.out.println("Customer not found.");
            return 0.0;
        }

        double totalAmount = 0.0;
        List<Order> orders = customer.getOrders();
        for (Order order : orders) {
            List<Product> products = order.getProducts();
            for (Product product : products) {
               // totalAmount += getProductPrice(product);
            }
        }

        return totalAmount;
    }

    public int getProductOrderCount(String productId) {
        return productOrderCount.getOrDefault(productId, 0);
    }

}
