package Java_Training_MidWeekProject_CSMS.person;

import java.util.ArrayList;
import java.util.List;

import Java_Training_MidWeekProject_CSMS.order.Order;



public class Customer {
    private String name;
    private int customerID;
    private List<Order> orderHistory;

    public Customer(String name, int customerID) {
        this.name = name;
        this.customerID = customerID;
        this.orderHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
    }

    public List<Order> getOrderHistory() {
        return new ArrayList<>(orderHistory);
    }
}

