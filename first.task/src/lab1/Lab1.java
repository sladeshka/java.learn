package lab1;

import java.util.Scanner;

public class Lab1 {
    public static void Lab1 () {
        // first task
        System.out.println("I");
        System.out.println("know");
        System.out.println("Java");
        System.out.println("well");
        // second task
        double x = ( 46 + 10 ) * ( 10 / 3 );
        double y = ( 29 ) * ( 4 ) * (- 15 );
        // third task
        int number = 10500;
        double result = (number / 10) / 10;
        // fourth task
        result = 3.6 * 4.1 * 5.9;
        // fifth task // 42 // 100 // 125
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        System.out.println(s1);
        scanner = new Scanner(System.in);
        s1 = scanner.nextInt();
        System.out.println(s1);
        scanner = new Scanner(System.in);
        s1 = scanner.nextInt();
        System.out.println(s1);
        scanner = new Scanner(System.in);
        s1 = scanner.nextInt();
        String message = s1 % 2 > 0? "Odd" : "Even";
        if(s1 > 100) {
            message = "Out of range";
        }
        System.out.println(message);
    }
}
