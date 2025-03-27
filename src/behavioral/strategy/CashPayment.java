package behavioral.strategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплатили" + amount + "готівкою");
    }
}
