package creational.abstractfacory;

public class MacCheckBox implements Checkbox{
    @Override
    public void check() {
        System.out.println("MacOS-checkbox active");
    }
}