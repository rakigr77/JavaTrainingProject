package Java_TrainingProject_CSMS_Advance;

public interface Payment {
    void processPayment(double amount) throws PaymentException;

    void generateReceipt(double amount);
}








