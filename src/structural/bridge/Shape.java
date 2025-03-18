package structural.bridge;

abstract public class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}