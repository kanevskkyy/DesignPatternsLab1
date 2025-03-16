package creational.singleton;

public final class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private String connection;

    private DatabaseConnection() {
        this.connection = "Connection";
    }

    public static DatabaseConnection getInstance() {
        var result = instance;
        if (result == null) {
            synchronized (DatabaseConnection.class) {
                result = instance;
                if (result == null) {
                    result = new DatabaseConnection();
                    instance = result;
                }
            }
        }
        return result;
    }

    public String getConnection() {
        return connection;
    }
}
