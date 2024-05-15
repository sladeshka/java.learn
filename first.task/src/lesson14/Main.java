package lesson14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(2);

        for (Integer i: ints) {
            System.out.println(i);
        }

        ints.forEach(System.out::println);
        ints.forEach(number -> System.out.println(number));
        ints.removeIf(i -> i > 1000);
    }
}
