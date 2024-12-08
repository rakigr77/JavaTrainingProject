package Java_Training_MidWeekProject_CSMS.order;

import java.util.ArrayList;
import java.util.List;

import Java_Training_MidWeekProject_CSMS.menu.MenuItem;
import Java_Training_MidWeekProject_CSMS.menu.SpecialtyItem;
import Java_Training_MidWeekProject_CSMS.person.Customer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private Customer customer;
    private List<MenuItem> items;
    private double totalAmount;

    public Order(int orderID, Customer customer) {
        this.orderID = orderID;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        totalAmount += item instanceof SpecialtyItem
                ? item.getPrice() * (1 - ((SpecialtyItem) item).getDiscount() / 100)
                : item.getPrice();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items:");
        for (MenuItem item : items) {
            System.out.println("  " + item);
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}
