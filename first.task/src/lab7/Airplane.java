package lab7;

public class Airplane {
    public Wing wing;
    public Airplane() {
        wing = new Wing();
    }
    public static class Wing {
        private double weight;
        public Wing() {}
        public Wing(double weight) {
            this.weight = weight;
        }
        public void printWingWeight() {
            System.out.println("Wing weight: " + weight + " kg");
        }
        public double getWeight() {
            return weight;
        }
    }
}