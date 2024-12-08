package Java_TrainingProject_CSMS_Advance;

import java.util.LinkedList;
import java.util.Queue;

public class ConcurrentOrderProcessor {
    private final Queue<Order> orderQueue = new LinkedList<>();
    private final int MAX_CAPACITY = 10;

    public synchronized void placeOrder(Order order) throws InterruptedException {
        while (orderQueue.size() == MAX_CAPACITY) {
            wait(); // Wait if the queue is full
        }
        orderQueue.add(order);
        System.out.println("Order placed: " + order.getOrderID());
        notifyAll(); // Notify consumers
    }

    public synchronized Order processOrder() throws InterruptedException {
        while (orderQueue.isEmpty()) {
            wait(); // Wait if the queue is empty
        }
        Order order = orderQueue.poll();
        notifyAll(); // Notify producers
        System.out.println("Order processed: " + order.getOrderID());
        return order;
    }
}

