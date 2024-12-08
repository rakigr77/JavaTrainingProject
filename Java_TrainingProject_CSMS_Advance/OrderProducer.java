package Java_TrainingProject_CSMS_Advance;

public class OrderProducer extends Thread {
    private final ConcurrentOrderProcessor processor;
    private final Order order;

    public OrderProducer(ConcurrentOrderProcessor processor, Order order) {
        this.processor = processor;
        this.order = order;
    }

    @Override
    public void run() {
        try {
            processor.placeOrder(order);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}



