package behavioral.visitor;

public interface Visitor {
    void visitCircle(Circle circle);
    void visitRectangle(Rectangle rectangle);
}
