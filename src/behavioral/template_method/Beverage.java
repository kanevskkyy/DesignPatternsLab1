package behavioral.template_method;

public abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Кип'ятимо воду");
    }

    private void pourInCup() {
        System.out.println("Наливаємо у чашку");
    }

    protected abstract void brew();
    protected abstract void addCondiments();
}