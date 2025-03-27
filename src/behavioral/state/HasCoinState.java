package behavioral.state;

public class HasCoinState implements State{
    @Override
    public void handle() {
        System.out.println("Монета прийнята. Натисніть кнопку для приготування кави.");
    }
}
