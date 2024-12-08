package Java_TrainingProject_CSMS_Advance;

import java.util.ArrayList;
import java.util.List;

import Java_Training_MidWeekProject_CSMS.menu.MenuItem;

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
        this.totalAmount = 0;
    }

    // Add an item to the order
    public void addItem(MenuItem item) {
        items.add(item);
//        if (item instanceof SpecialtyItem) {
//            totalAmount += ((SpecialtyItem) item).getDiscountedPrice();
//        } else {
            totalAmount += item.getPrice();
       // }
    }

    // Calculate total amount
    public double calculateTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderID + ", Customer: " + customer.getName() + ", Total: $" + totalAmount + ", Items: " + items;
    }

	public void addItem(Java_TrainingProject_CSMS_Advance.MenuItem item) {
		// TODO Auto-generated method stub
		
	}
}


