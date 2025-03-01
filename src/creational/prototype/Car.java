package creational.prototype;

public class Car implements Prototype {
    private String color;
    private String model;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    @Override
    public Prototype clone() {
        return new Car(this.model, this.color);
    }

    @Override
    public String toString() {
        return "Car, model=" + model + ", color=" + color;
    }
}
