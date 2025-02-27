package Design_Patterns.Creational.PrototypeAndRegistry.User;

import java.util.ArrayList;
import java.util.List;

public class UserPrototypeRegistryImp implements UserPrototypeRegistry {
    List<User> users;

    UserPrototypeRegistryImp() {
        users = new ArrayList<>();
    }

    @Override
    public void addPrototype(User user) {
        users.add(user);
    }

    @Override
    public User getPrototype(UserType type) {
        User userPrototype = null;
        for (User user: users) {
            if (type == user.getType()) {
                userPrototype = user;
            }
        }
        return userPrototype;
    }

    @Override
    public User clone(UserType type) {
        User userPrototype = null;
        for (User user: users) {
            if (type == user.getType()) {
                userPrototype = user.cloneObject();
            }
        }
        return userPrototype;
    }

}