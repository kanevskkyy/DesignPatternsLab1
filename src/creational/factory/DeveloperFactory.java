package creational.factory;

public class DeveloperFactory {
    public static Developer createDeveloper(DeveloperType type) {
        switch (type){
            case JAVA:
                return new JavaDeveloper();

            case C_PLUS_PLUS:
                return new CppDeveloper();

            default:
                throw new IllegalArgumentException("Unknown developer type: " + type);
        }
    }
}