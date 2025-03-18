package structural.facade;

public class HomeTheaterFacade {
    private TV tv;
    private AudioSystem audio;
    private DVDPlayer dvd;

    public HomeTheaterFacade(TV tv, AudioSystem audio, DVDPlayer dvd) {
        this.tv = tv;
        this.audio = audio;
        this.dvd = dvd;
    }

    public void startMovie(String movie) {
        System.out.println("Готуємося до перегляду фільму...");
        tv.turnOn();
        audio.turnOn();
        audio.setVolume(7);
        dvd.turnOn();
        dvd.playMovie(movie);
        System.out.println("Приємного перегляду!");
    }

    public void stopMovie() {
        System.out.println("Завершення перегляду фільму...");
        dvd.turnOff();
        audio.turnOff();
        tv.turnOff();
        System.out.println("Домашній кінотеатр вимкнено");
    }
}
