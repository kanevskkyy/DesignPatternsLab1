import creational.abstractfacory.Application;
import creational.abstractfacory.GUIFactory;
import creational.abstractfacory.WinFactory;
import creational.builder.Garage;
import creational.builder.Garden;
import creational.builder.House;
import creational.factory.Developer;
import creational.factory.DeveloperFactory;
import creational.prototype.Car;
import creational.singleton.ThreadSafeDoubleCheckLocking;

public class Main {
    public static void main(String[] args) {
        /*Fabric Method*/
        Developer javaDeveloper = DeveloperFactory.createDeveloper("java");
        javaDeveloper.writeCode();

        Developer cppDeveloper = DeveloperFactory.createDeveloper("c++");
        cppDeveloper.writeCode();
        /* End */

        /* Abstract Factory */
        GUIFactory factory = new WinFactory();
        Application app = new Application(factory);
        app.render();
        /* End */

        /* Builder */
        House house = new House.Builder("concrete", "brick", "tile")
                .withWindows("double-glazed")
                .withGarage(new Garage(2, true))
                .withGarden(new Garden(true, true, false))
                .build();

        System.out.println(house);

        /* End */

        /* Prototype */
        Car originalCar = new Car("Tesla Model 3", "Red");
        Car clonedCar = (Car) originalCar.clone();

        System.out.println("Original Car: " + originalCar);
        System.out.println("Cloned Car: " + clonedCar);
        /* End */

        /* Singleton */
        ThreadSafeDoubleCheckLocking singleton = ThreadSafeDoubleCheckLocking.getInstance();
        System.out.println("Singleton instance: " + singleton);
        /* End */
    }
}