package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class lab4 {
    public static void lab4 () {
        // first task
        for (int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }
        // second task
        for (int i = 1; i <= 100; i += 1) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            if (i % 5 == 0) {
                System.out.println(i);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
        // third task
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        Integer x = scanner.nextInt();
        System.out.println("Enter second number");
        Integer y = scanner.nextInt();
        System.out.println("Enter third number");
        Integer z = scanner.nextInt();
        System.out.println("Result: " + (x + y == z));
        // fourth task
        System.out.println("Enter first number");
        x = scanner.nextInt();
        System.out.println("Enter second number");
        y = scanner.nextInt();
        System.out.println("Enter third number");
        z = scanner.nextInt();
        System.out.println("Result: " + (z > y && y > x));
        // fifth task
        int[] array = {3, -3, 7, 4, 5, 4, 3};
        System.out.println("There " + (array[0] == 3 || array[array.length - 1] == 3 ? "are" : "is no") + " 3 in the array " + Arrays.toString(array));
        boolean arrayHasValue = false;
        for (int number : array) {
            if (number == 1 || number == 3) {
                arrayHasValue = true;
                break;
            }
        }
        // sixth task
        System.out.println("There " + (arrayHasValue ? "are" : "are no") + " 3 or 1 in the array " + Arrays.toString(array));
    }
}
