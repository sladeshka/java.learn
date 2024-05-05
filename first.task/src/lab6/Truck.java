package lab6;

public class Truck extends Car {
    public int numberOfWheels;
    public int weightLimit;

    public void newWheels(int wheels) {
        numberOfWheels = wheels;
        System.out.println("Number of wheels: " + numberOfWheels);
    }

    public Truck(int weight, String model, char color, float speed, int wheels, int limit) {
        super(weight, model, color, speed);
        numberOfWheels = wheels;
        weightLimit = limit;
    }
}