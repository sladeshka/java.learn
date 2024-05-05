package lab6;

public class Car {
    public int weight;
    public String model;

    public char color;
    public float speed;


    public void outPut() {
        System.out.println("The weight of " + model + " is " + weight + "kg.");
        System.out.println("The color of the car is " + color + " and its speed is " + speed);
    }

    public Car(int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car() {
    }
}
