package creational.builder;


public class Garage {
    private final int size; // Кількість місць для машин
    private final boolean hasElectricDoor;

    public Garage(int size, boolean hasElectricDoor) {
        if (size <= 0) {
            throw new IllegalArgumentException("Garage size must be greater than 0");
        }
        this.size = size;
        this.hasElectricDoor = hasElectricDoor;
    }

    @Override
    public String toString() {
        return "garage for " + size + " cars" + (hasElectricDoor ? " with an electric door" : "");
    }
}