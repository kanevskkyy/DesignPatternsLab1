package behavioral.memento;

public class Originator {
    private String state;

    public void setState(String state) {
        System.out.println("Змінюємо стан на: " + state);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveToMemento() {
        System.out.println("Зберігаємо стан: " + state);
        return new Memento(state);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.getState();
        System.out.println("Відновлено стан: " + state);
    }
}
