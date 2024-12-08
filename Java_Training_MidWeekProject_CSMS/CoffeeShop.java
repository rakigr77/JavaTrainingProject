package Java_Training_MidWeekProject_CSMS;
import java.util.HashMap;
import java.util.HashSet;



import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import Java_Training_MidWeekProject_CSMS.menu.Menu;
import Java_Training_MidWeekProject_CSMS.menu.MenuItem;
import Java_Training_MidWeekProject_CSMS.menu.SpecialtyItem;
import Java_Training_MidWeekProject_CSMS.order.ConcurrentOrderProcessor;
import Java_Training_MidWeekProject_CSMS.order.Order;
import Java_Training_MidWeekProject_CSMS.paymentProcessing.CreditCardPayment;
import Java_Training_MidWeekProject_CSMS.paymentProcessing.Payment;
import Java_Training_MidWeekProject_CSMS.paymentProcessing.PaymentException;
import Java_Training_MidWeekProject_CSMS.person.Customer;

public class CoffeeShop {
    public static void main(String[] args) {
        // Initialize customers, menu items, and orders
        Customer customer1 = new Customer("John Doe", 1);
        Menu<MenuItem> menu = new Menu<>();
        menu.addItem(new MenuItem("Espresso", 3.0, 101));
        menu.addItem(new SpecialtyItem("Latte", 5.0, 102, 10.0));

        // Place an order
        Order order1 = new Order(1, customer1);
        order1.addItem(new MenuItem("Espresso", 3.0, 101));
        order1.addItem(new SpecialtyItem("Latte", 5.0, 102, 10.0));

        customer1.addOrder(order1);
        order1.displayOrderDetails();

        // Process payment
        Payment payment = new CreditCardPayment();
        try {
            payment.processPayment(order1.getTotalAmount());
            payment.generateReceipt(order1.getTotalAmount());
        } catch (PaymentException e) {
            System.err.println(e.getMessage());
        }

        // Multithreading example
        Queue<Order> orderQueue = new ConcurrentLinkedQueue<>();
        orderQueue.add(order1);

        Thread orderProcessor = new Thread(new ConcurrentOrderProcessor(orderQueue));
        orderProcessor.start();
    }
}

