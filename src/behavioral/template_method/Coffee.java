package behavioral.template_method;

public class Coffee extends Beverage {
    protected void brew() {
        System.out.println("Заварюємо каву");
    }

    protected void addCondiments() {
        System.out.println("Додаємо цукор і молоко");
    }
}