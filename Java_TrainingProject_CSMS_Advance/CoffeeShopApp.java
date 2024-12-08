package Java_TrainingProject_CSMS_Advance;

import java.util.Scanner;

import Java_Training_MidWeekProject_CSMS.menu.Menu;
import Java_Training_MidWeekProject_CSMS.menu.MenuItem;
import Java_Training_MidWeekProject_CSMS.menu.SpecialtyItem;

public class CoffeeShopApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        Customer customer = null; // Current logged-in customer
        Menu<MenuItem> menu = new Menu<MenuItem>(); // Menu contains all available items
        // Load sample menu items
        menu.addItem(new MenuItem("Espresso", 3.0, 1));
        menu.addItem(new SpecialtyItem("Latte", 4.5, 2, 10.0));
        menu.addItem(new MenuItem("Cappuccino", 4.0, 3));

        
        
        while (true) {
            System.out.println("Welcome to Coffee Shop!");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. View Menu");
            System.out.println("4. Place Order");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Registration
                    System.out.print("Enter your name: ");
                    String name = scanner.next();
                    customer = new Customer(name, (int) (Math.random() * 1000));
                    System.out.println("Registered successfully! Your ID: " + customer.getCustomerID());
                    break;

                case 2:
                    // Login (for simplicity, no database lookup here)
                    System.out.print("Enter your customer ID: ");
                    int id = scanner.nextInt();
                    if (customer != null && customer.getCustomerID() == id) {
                        System.out.println("Login successful! Welcome, " + customer.getName());
                    } else {
                        System.out.println("Invalid ID. Please register first.");
                    }
                    break;

                case 3:
                    // Display menu items
                    menu.displayMenu();
                    break;

                case 4:
                    // Place an order
                    if (customer == null) {
                        System.out.println("Please register or login first!");
                        break;
                    }
                    Order order = new Order((int) (Math.random() * 1000), customer);
                    boolean ordering = true;
                    while (ordering) {
                        menu.displayMenu();
                        System.out.print("Enter item ID to add to your order (0 to finish): ");
                        int itemID = scanner.nextInt();
                        if (itemID == 0) {
                            ordering = false;
                        } else {
                            MenuItem item = menu.getItemById(itemID);
                            if (item != null) {
                                order.addItem(item);
                                System.out.println(item.getName() + " added to order.");
                            } else {
                                System.out.println("Invalid item ID.");
                            }
                        }
                    }
                    System.out.println("Order placed! Summary:");
                    System.out.println(order);
                    customer.addOrder(order);
                    break;

                case 5:
                    // Exit
                    System.out.println("Thank you for visiting!");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}


