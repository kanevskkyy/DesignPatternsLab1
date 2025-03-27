package behavioral.visitor;

public class PrintVisitor implements Visitor {
    public void visitCircle(Circle circle) {
        System.out.println("Це коло з радіусом: " + circle.radius);
    }

    public void visitRectangle(Rectangle rectangle) {
        System.out.println("Це прямокутник з шириною: " + rectangle.width + " і висотою: " + rectangle.height);
    }
}