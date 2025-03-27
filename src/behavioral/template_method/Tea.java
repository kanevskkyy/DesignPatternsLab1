package behavioral.template_method;

public class Tea extends Beverage {
    protected void brew() {
        System.out.println("Заварюємо чай");
    }

    protected void addCondiments() {
        System.out.println("Додаємо лимон");
    }
}