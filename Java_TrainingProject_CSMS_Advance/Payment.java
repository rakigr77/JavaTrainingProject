package Java_TrainingProject_CSMS_Advance;

interface Payment {
    void processPayment(double amount);
    void generateReceipt();
}

class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Generating credit card receipt.");
    }
}

class CashPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Generating cash payment receipt.");
    }
}

