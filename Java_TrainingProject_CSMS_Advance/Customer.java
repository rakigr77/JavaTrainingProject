package Java_TrainingProject_CSMS_Advance;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;



import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int customerID;
    private List<Order> orderHistory;

    // Constructor
    public Customer(String name, int customerID) {
        this.name = name;
        this.customerID = customerID;
        this.orderHistory = new ArrayList<>();
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    // Add order to order history
    public void addOrder(Order order) {
        orderHistory.add(order);
    }
}
