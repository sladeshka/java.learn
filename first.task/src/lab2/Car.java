package lab2;

public class Car {
    private String color;
    private String name;
    private double weight;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void displayDetails() {
        System.out.println("Car Name: " + this.name);
        System.out.println("Car Color: " + this.color);
        System.out.println("Car Weight: " + this.weight + " kg");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}