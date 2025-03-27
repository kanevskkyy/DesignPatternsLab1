package behavioral.visitor;

public class Rectangle implements Shape {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }
}