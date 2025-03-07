package Design_Patterns.Creational.PrototypeAndRegistry.User;

public class User implements CloneableObject<User> {
    private long userId;
    private String username;
    private String email;
    private String displayName;
    private int age;
    private UserType type;

    public User(long userId, String username, String email, String displayName, int age, UserType type) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.displayName = displayName;
        this.age = age;
        this.type = type;
    }

    public User(User user) {
        this.userId = user.userId;
        this.username = user.username;
        this.email = user.email;
        this.displayName = user.displayName;
        this.age = user.age;
        this.type = user.type;
    }

    public long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getAge() {
        return age;
    }

    public UserType getType() {
        return type;
    }

    @Override
    public User cloneObject() {
        User newUser = new User(this);
        return newUser;
    }

}