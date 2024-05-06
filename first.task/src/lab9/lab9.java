package lab9;

import java.util.*;

public class lab9 {
    public static void main(String[] args) {
        // first task
        Collection<User> users = Duplicate.createUserCollectionWithDuplicates();
        users = Duplicate.remove(users);
        System.out.println(users);
        // second task
        Lists lists = new Lists();
        lists.run();
        // third task
        Map<String, Integer> usersMap = new HashMap<>();
        Random random = new Random();
        for (User user : users) {
            usersMap.put(user.getName(), random.nextInt(1000));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = scanner.nextLine();
        if (usersMap.containsKey(userName)) {
            System.out.println("Number of points the user has " + userName + ": " + usersMap.get(userName));
        } else {
            System.out.println("User named " + userName + " not found.");
        }
    }
}
