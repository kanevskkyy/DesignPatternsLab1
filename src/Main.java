import creational.abstractfacory.Application;
import creational.abstractfacory.GUIFactory;
import creational.abstractfacory.WinFactory;
import creational.builder.House;
import creational.builder.HouseBuilder;
import creational.builder.HouseDirector;
import creational.builder.ConcreteHouseBuilder;
import creational.factory.Developer;
import creational.factory.DeveloperFactory;
import creational.prototype.Car;
import creational.singleton.Singleton;

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
        HouseBuilder builder = new ConcreteHouseBuilder();
        HouseDirector director = new HouseDirector(builder);
        House house = director.constructHouse();
        System.out.println(house);
        /* End */

        /* Prototype */
        Car originalCar = new Car("Tesla Model 3", "Red");
        Car clonedCar = (Car) originalCar.clone();

        System.out.println("Original Car: " + originalCar);
        System.out.println("Cloned Car: " + clonedCar);
        /* End */

        /* Singleton */
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are both instances the same? " + (instance1 == instance2));
        /* End */
    }
}