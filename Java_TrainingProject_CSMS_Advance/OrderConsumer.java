package Java_TrainingProject_CSMS_Advance;

public class OrderConsumer extends Thread {
    private final ConcurrentOrderProcessor processor;

    public OrderConsumer(ConcurrentOrderProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        try {
            while (true) {
                processor.processOrder();
                Thread.sleep(1000); // Simulate processing time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}