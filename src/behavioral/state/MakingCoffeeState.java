package behavioral.state;

public class MakingCoffeeState implements State {
    @Override
    public void handle() {
        System.out.println("Кава готується. Очікуй бро");
    }
}
