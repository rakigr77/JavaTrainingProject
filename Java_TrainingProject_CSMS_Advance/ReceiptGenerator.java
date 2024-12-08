package Java_TrainingProject_CSMS_Advance;

import java.io.FileWriter;
import java.io.IOException;

public class ReceiptGenerator {
    public static void generateReceipt(Order order) {
        try (FileWriter writer = new FileWriter("order_" + order.getOrderID() + ".txt")) {
            writer.write("Order ID: " + order.getOrderID() + "\n");
            writer.write("Customer: " + order.getCustomer().getName() + "\n");
            writer.write("Items:\n");
//            for (MenuItem item : order.getItems()) {
//                writer.write(item.toString() + "\n");
//            }
            writer.write("Total: $" + order.getTotalAmount() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//public void searchMenu(String keyword) {
//    menu.stream()
//        .filter(item -> item.getName().toLowerCase().contains(keyword.toLowerCase()))
//        .forEach(System.out::println);
//}
//
//public void applyDiscounts() {
//    menu.stream()
//        .filter(item -> item instanceof SpecialtyItem)
//        .map(item -> (SpecialtyItem) item)
//        .forEach(item -> {
//            double discountedPrice = item.getPrice() * (1 - item.getDiscount() / 100);
//            System.out.println("Discounted Price for " + item.getName() + ": $" + discountedPrice);
//        });
//}

