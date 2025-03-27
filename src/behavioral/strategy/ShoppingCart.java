package behavioral.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Будь ласка, виберіть спосіб оплати.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
