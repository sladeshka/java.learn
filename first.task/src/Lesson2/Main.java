package Lesson2;

public class Main {
    public static void main(String[] args) {
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