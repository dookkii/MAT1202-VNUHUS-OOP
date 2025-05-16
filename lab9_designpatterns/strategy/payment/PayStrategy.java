package lab9_designpatterns.strategy.payment;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
