package creational.builder;

public interface HouseBuilder {
    void buildFoundation();
    void buildWalls();
    void buildRoof();
    void buildWindows();
    House getResult();
}
