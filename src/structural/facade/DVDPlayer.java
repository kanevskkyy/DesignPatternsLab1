package structural.facade;

public class DVDPlayer {
    void turnOn() {
        System.out.println("DVD-програвач увімкнено");
    }

    void turnOff() {
        System.out.println("DVD-програвач вимкнено");
    }

    void playMovie(String movie) {
        System.out.println("Відтворення фільму: " + movie);
    }
}
