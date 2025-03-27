package behavioral.visitor;

public class AreaVisitor implements Visitor {
    public void visitCircle(Circle circle) {
        double area = Math.PI * circle.radius * circle.radius;
        System.out.println("Площа кола: " + area);
    }

    public void visitRectangle(Rectangle rectangle) {
        double area = rectangle.width * rectangle.height;
        System.out.println("Площа прямокутника: " + area);
    }
}