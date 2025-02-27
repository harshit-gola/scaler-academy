package Design_Patterns.Creational.Singleton;

public class DBConnection {
    String url;
    String username;
    String password;
    Long port;
    private static DBConnection instance;

    private DBConnection() {}

    public static DBConnection getInstance() {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}
