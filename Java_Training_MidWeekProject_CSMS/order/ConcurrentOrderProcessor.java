package Java_Training_MidWeekProject_CSMS.order;

import java.util.LinkedList;
import java.util.Queue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentOrderProcessor implements Runnable {
    private Queue<Order> orderQueue;

    public ConcurrentOrderProcessor(Queue<Order> orderQueue) {
        this.orderQueue = orderQueue;
    }

    @Override
    public void run() {
        while (!orderQueue.isEmpty()) {
            synchronized (orderQueue) {
                Order order = orderQueue.poll();
                if (order != null) {
                    System.out.println("Processing order: " + order.getTotalAmount());
                }
            }
        }
    }
}

