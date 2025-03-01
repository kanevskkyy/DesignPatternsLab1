package creational.builder;

public class House {
    private String foundation;
    private String walls;
    private String roof;
    private String windows;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", walls=" + walls + ", roof=" + roof + ", windows=" + windows + "]";
    }
}