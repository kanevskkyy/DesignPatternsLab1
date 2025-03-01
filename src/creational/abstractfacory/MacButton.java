package creational.abstractfacory;

public class MacButton implements Button{
    @Override
    public void click() {
        System.out.println("MacOS-button clicked");
    }
}
