package behavioral.memento;
import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> history = new ArrayList<>();

    public void addMemento(Memento memento) {
        history.add(memento);
    }

    public Memento getMemento(int index) {
        return history.get(index);
    }
}
