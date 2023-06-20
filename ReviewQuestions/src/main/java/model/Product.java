package model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public String productId;
    public String name;
    public List<Order> orderList;

    public Product(String productId, String name) {
        this.productId = productId;
        this.name = name;
        this.orderList = new ArrayList<> ();
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }
}
