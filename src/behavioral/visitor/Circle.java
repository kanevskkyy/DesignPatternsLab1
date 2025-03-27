package behavioral.visitor;

public class Circle implements Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}