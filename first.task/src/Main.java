import Lesson2.Car;
import Lesson2.CarService;

import static lab1.Lab1.Lab1;
import static lesson1.Types.testJavaTypes;

public class Main {
    public static void main(String[] args) {
        testJavaTypes();
        Lab1();
        Car car = new Car();
        car.setSeatPlace(5);
        System.out.println(car);
        System.out.println(car.getBrand());
        System.out.println(car.getColor().getDesctiption());
        car.setPrice(50000L);
        System.out.println(CarService.totalPrice(car, 10000));
        System.out.println(CarService.totalPrice(car, null));
    }

    public String someMethod (String word) {
        String localString;
        int localInt;

        if(word == null) {
            localInt = 0;
        } else {
            localInt = word.length();
        }

        System.out.println(localInt);

        return null;
    }

    public void overlocadedeMethod() {
        //
    }

    public String overlocadedeMethod(Integer number) {
        return null;
    }

    //
}