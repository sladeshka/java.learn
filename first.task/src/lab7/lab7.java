package lab7;

public class lab7 {
    public static void main(String[] args) {
        // first task
        Airplane.Wing wing = new Airplane.Wing(1234.00);
        wing.printWingWeight();
        // second task
        Airplane airplane1 = new Airplane();
        airplane1.wing = new Airplane.Wing(1500.00);
        airplane1.wing.printWingWeight();
        Airplane airplane2 = new Airplane();
        airplane2.wing = new Airplane.Wing(2000.00);
        airplane2.wing.printWingWeight();
    }
}
