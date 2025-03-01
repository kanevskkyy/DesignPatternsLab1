package creational.abstractfacory;

public class WinCheckbox implements Checkbox{
    @Override
    public void check() {
        System.out.println("Windows-checkbox active");
    }
}
