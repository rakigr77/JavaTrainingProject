package Java_Training_MidWeekProject_CSMS.paymentProcessing;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) throws PaymentException {
        if (amount <= 0) throw new PaymentException("Invalid payment amount.");
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void generateReceipt(double amount) {
        System.out.println("Receipt: Paid $" + amount + " via Credit Card.");
    }
}

