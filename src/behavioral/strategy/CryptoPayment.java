package behavioral.strategy;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплатили" + amount + "криптою");
    }
}
