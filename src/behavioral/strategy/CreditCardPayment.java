package behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплатили " + amount + "кредитною картою");
    }
}
