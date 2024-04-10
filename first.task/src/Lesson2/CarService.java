package Lesson2;

public class CarService {
    public static long totalPrice(Car car, Integer service) {
        long price = car.getPrice();
        return price + service;
    }
}
