package Java_TrainingProject_CSMS_Advance;

import java.util.ArrayList;
import java.util.List;



import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private Customer customer;
    private List<MenuItem> items;
    private double totalAmount;

    // Constructor
    public Order(int orderID, Customer customer) {
        this.orderID = orderID;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    // Add item to the order
    public void addItem(MenuItem item) {
        items.add(item);
        totalAmount += item.getPrice();
    }

    // Calculate total amount
    public double getTotalAmount() {
        return totalAmount;
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items:");
        for (MenuItem item : items) {
            System.out.println(item);
        }
        System.out.println("Total Amount: $" + totalAmount);
    }

	public String getOrderID() {
		// TODO Auto-generated method stub
		return null;
	}

	public MenuItem getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
