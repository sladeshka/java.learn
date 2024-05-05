package lab9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Duplicate {
    public static Collection<User> createUserCollectionWithDuplicates() {
        List<User> users = new ArrayList<>();
        users.add(new User("User1"));
        users.add(new User("User2"));
        users.add(new User("User1"));
        users.add(new User("User3"));
        users.add(new User("User4"));
        return users;
    }
    public static <T> Collection<T> remove(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
