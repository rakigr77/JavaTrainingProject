package Java_TrainingProject_CSMS_Advance;
import java.util.*;
import Java_TrainingProject_CSMS_Advance.Menu;

public class CoffeeShopManagementSystem {
    private static List<MenuItem> menu = new ArrayList<>();
    private static Map<Integer, Customer> customers = new HashMap<>();
    private static int customerCounter = 1;
    private static int orderCounter = 1;

    public static void main(String[] args) {
        initializeMenu();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Coffee Shop!");
            System.out.println("1. Register");
            System.out.println("2. Log in");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 : registerCustomer(scanner);
                case 2 : loginCustomer(scanner);
                case 3 :{
                    System.out.println("Thank you for visiting!");
                    return;
                }
                default : System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void registerCustomer(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        Customer customer = new Customer(name, customerCounter++);
        customers.put(customer.getCustomerID(), customer);
        System.out.println("Registration successful! Your Customer ID is: " + customer.getCustomerID());
    }

    private static void loginCustomer(Scanner scanner) {
        System.out.print("Enter your Customer ID: ");
        int customerID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Customer customer = customers.get(customerID);
        if (customer == null) {
            System.out.println("Customer not found! Please register first.");
            return;
        }

        System.out.println("Welcome back, " + customer.getName() + "!");
        handleCustomerMenu(scanner, customer);
    }

    private static void handleCustomerMenu(Scanner scanner, Customer customer) {
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. View Order History");
            System.out.println("4. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 : displayMenu();
                case 2 : placeOrder(scanner, customer);
                case 3 : viewOrderHistory(customer);
                case 4 : {
                    System.out.println("Logging out...");
                    return;
                }
                default : System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void initializeMenu() {
        menu.add(new MenuItem("Espresso", 3.5, 1));
        menu.add(new SpecialtyItem("Cappuccino", 4.0, 2, 10));
        menu.add(new MenuItem("Latte", 4.5, 3));
        menu.add(new SpecialtyItem("Mocha", 5.0, 4, 15));
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        for (MenuItem item : menu) {
            System.out.println(item);
        }
    }

    private static void placeOrder(Scanner scanner, Customer customer) {
        Order order = new Order(orderCounter++, customer);

        while (true) {
            displayMenu();
            System.out.print("Enter the Item ID to add to your order (or 0 to finish): ");
            int itemID = scanner.nextInt();

            if (itemID == 0) break;

            MenuItem item = menu.stream()
                .filter(menuItem -> menuItem.getItemID() == itemID)
                .findFirst()
                .orElse(null);

            if (item != null) {
                order.addItem(item);
                System.out.println(item.getName() + " added to your order.");
            } else {
                System.out.println("Invalid Item ID! Please try again.");
            }
        }

        customer.addOrder(order);
        order.displayOrderDetails();
        System.out.println("Order placed successfully!");
    }

    private static void viewOrderHistory(Customer customer) {
        System.out.println("\nOrder History:");
        if (customer.getOrderHistory().isEmpty()) {
            System.out.println("No orders placed yet.");
        } else {
            customer.getOrderHistory().forEach(Order::displayOrderDetails);
        }
    }
}
