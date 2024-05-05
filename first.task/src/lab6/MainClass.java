package lab6;

import java.util.Scanner;

public class MainClass {
    static Scanner scanner = new Scanner(System.in);
    int number;
    public String enterUserInfo() {
        System.out.print("Enter the user's age: ");
        return String.valueOf(scanner.nextInt());
    }
}
