package creational.factory;

public class DeveloperFactory {
    public static Developer createDeveloper(String developer){
        if (developer.equalsIgnoreCase("java")) return new JavaDeveloper();
        else if (developer.equalsIgnoreCase("c++"))  return new CppDeveloper();
        else throw new IllegalArgumentException("Unknown message type");
    }
}