package structural.bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Малюємо квадрат. ");
        color.applyColor();
    }
}
