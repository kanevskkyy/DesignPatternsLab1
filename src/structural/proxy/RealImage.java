package structural.proxy;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Завантаження зображення: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Відображення зображення: " + filename);
    }
}
