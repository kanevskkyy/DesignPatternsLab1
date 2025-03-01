package creational.abstractfacory;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows-button clicked");
    }
}
