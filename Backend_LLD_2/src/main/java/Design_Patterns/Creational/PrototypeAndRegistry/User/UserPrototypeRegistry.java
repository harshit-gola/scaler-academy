package Design_Patterns.Creational.PrototypeAndRegistry.User;

public interface UserPrototypeRegistry {
    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}
