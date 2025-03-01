package creational.builder;

public class HouseDirector {
    private HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }


    public House constructHouse() {
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildRoof();
        builder.buildWindows();
        return builder.getResult();
    }

}
