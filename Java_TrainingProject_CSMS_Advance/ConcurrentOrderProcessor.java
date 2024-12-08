package Java_TrainingProject_CSMS_Advance;

class ConcurrentOrderProcessor extends Thread {
    private Order order;

    public ConcurrentOrderProcessor(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        synchronized (order) {
            try {
                // Simulate order processing
                System.out.println("Processing order " + order);
                Thread.sleep(2000);
                System.out.println("Order processed: " + order);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
