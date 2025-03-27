package behavioral.state;

public class NoChainState implements State {
    @Override
    public void handle() {
        System.out.println("Вставте монету пліз");
    }
}
