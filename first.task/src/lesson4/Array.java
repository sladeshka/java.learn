package lesson4;

import Lesson2.Car;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] ints = new int[10];

        ints[0] = 20;
        ints[1] = 20;
        ints[2] = 20;
        ints[3] = 20;
        ints[4] = 20;
        ints[5] = 20;
        ints[6] = 20;

        System.out.println(Arrays.toString(ints));
        String[] strings = new String[5];
        System.out.println(Arrays.toString(strings));

        long[] longs = new long[] {123L, 321L, 333L};
        long[] longs1 = {123L};

        Car[] cars = new Car[3];
        cars[0] = new Car();
        cars[1] = new Car();
        cars[2] = new Car();

        System.out.println(Arrays.toString(cars));

        for (int i = 0; i < longs.length; i++) {
            if(longs[i] % 2 == 0) {
                System.out.println(longs[i]);
            }
        }

        /*for (Car car : cars) {
            if (!car.getBrand().equals("Mercedes")) {
                break;
            }
            if (!car.getBrand().equals("BMW")) {
                continue;
            }

            System.out.println(car);
        }*/

        int x = 1;
        do {
            System.out.println(x++);
        } while (x == 0);

        while (x < 10) {
            x++;
        }

        varargMethod(123, "Hello");
        varargMethod(123, "Hello", "world", "!");

        Arrays.sort(longs);
        System.out.println(Arrays.toString(longs));

        int i = Arrays.binarySearch(longs, 333);
        int j = Arrays.binarySearch(longs, 444);
        System.out.println(Arrays.toString(longs));
        System.out.println(j);
    }

    public static void varargMethod(Integer sum, String... line){
        for(String s: line) {
            System.out.println(s);
        }
    }
}
