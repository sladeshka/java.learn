package lab4;

import Lesson2.Car;

import java.util.Arrays;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        lab4();
    }

    public static void lab4() {
        // first task part one
        printOddNumber();
        // second task part one
        printNumberCanBeDividedWithoutRemainder();
        // third task part one
        calculateSumXAndYAndCompareWithZ();
        // fourth task part one
        compareXYZ();
        // fifth task part one
        int[] task5Part1 = {3, -3, 7, 4, 5, 4, 3};
        check3BeginningAndEnd(task5Part1);
        // sixth task part one
        check3or1(task5Part1);
        // first task part two
        int[] task1Part2Test1 = {1, 2, 3, 4, 5};
        int[] task1Part2Test2 = {1, 2, 3, 6, 5};
        checkArraySorting(task1Part2Test1);
        checkArraySorting(task1Part2Test2);
        // second task part two
        printArrayByLength();
        // third task part two
        swapFirstAndLast(task1Part2Test2);
        // fourth task part two
        int[] task4Part2 = {1, 2, 3, 1, 2, 4};
        findFirstUniqueNumber(task4Part2);
    }

    public static void printOddNumber() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public static void printNumberCanBeDividedWithoutRemainder() {
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
    }

    public static void calculateSumXAndYAndCompareWithZ() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = scanner.nextInt();
        System.out.println("Enter second number");
        int y = scanner.nextInt();
        System.out.println("Enter third number");
        int z = scanner.nextInt();
        System.out.println("Result: " + (x + y == z));
    }

    public static void compareXYZ() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = scanner.nextInt();
        System.out.println("Enter second number");
        int y = scanner.nextInt();
        System.out.println("Enter third number");
        int z = scanner.nextInt();
        System.out.println("Result: " + (z > y && y > x));
    }

    public static void check3BeginningAndEnd(int[] array) {
        System.out.println("There " + (array[0] == 3 || array[array.length - 1] == 3 ? "are" : "is no") + " 3 in the array " + Arrays.toString(array));
    }

    public static void check3or1(int[] array) {
        boolean arrayHasValue = false;
        for (int number : array) {
            if (number == 1 || number == 3) {
                arrayHasValue = true;
                break;
            }
        }
        System.out.println("There " + (arrayHasValue ? "are" : "are no") + " 3 or 1 in the array " + Arrays.toString(array));
    }

    public static void checkArraySorting(int[] array) {
        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static void printArrayByLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Enter " + length + " numbers:");

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array of " + length + " elements:");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void swapFirstAndLast(int[] array) {
        if (array.length >= 2) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
    }

    public static void findFirstUniqueNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                // found
            }
        }
        // not found
    }
}
