package Java_Training_MidWeekProject_CSMS.paymentProcessing;

public interface Payment {
    void processPayment(double amount) throws PaymentException;

    void generateReceipt(double amount);
}




