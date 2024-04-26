package lab2;

import Lesson2.Car;
import Lesson2.CarService;

public class lab2 {
    public static void lab2() {
        // first task
        double result1 = Calculator.add(3.5, 2.5);
        System.out.println(result1);
        long result2 = Calculator.add(10L, 5L);
        System.out.println(result2);
        int result3 = Calculator.add(7, 4);
        System.out.println(result3);
        // second task
        // Muscle memory has already been trained : )
        Car car = new Car();
        car.setSeatPlace(5);
        System.out.println(car);
        System.out.println(car.getBrand());
        System.out.println(car.getColor().getDesctiption());
        car.setPrice(50000L);
        System.out.println(CarService.totalPrice(car, 10000));
        System.out.println(CarService.totalPrice(car, null));
    }
}
