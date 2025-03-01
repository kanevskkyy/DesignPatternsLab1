package creational.builder;

public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete Foundation");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Concrete Walls");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete Roof");
    }

    @Override
    public void buildWindows() {
        house.setWindows("Concrete Windows");
    }

    @Override
    public House getResult() {
        return this.house;
    }
}
