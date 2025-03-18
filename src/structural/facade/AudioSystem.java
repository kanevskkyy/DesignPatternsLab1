package structural.facade;

public class AudioSystem {
    void turnOn() {
        System.out.println("Аудіосистема увімкнена");
    }

    void turnOff() {
        System.out.println("Аудіосистема вимкнена");
    }

    void setVolume(int level) {
        System.out.println("Гучність встановлено на " + level);
    }
}
