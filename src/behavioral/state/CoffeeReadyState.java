package behavioral.state;

public class CoffeeReadyState implements State {
    @Override
    public void handle() {
        System.out.println("Забери каву бро");
    }
}
