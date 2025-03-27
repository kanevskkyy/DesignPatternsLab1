package behavioral.state;

public class CoffeeMachine {
    private State state;

    public CoffeeMachine() {
        this.state = new NoChainState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void action(){
        state.handle();
    }

}
