package lab3;

public class House {
    private int numberOfFloors;
    private int yearBuilt;
    private String name;

    public void setValues(int numberOfFloors, int yearBuilt, String name) {
        this.numberOfFloors = numberOfFloors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }

    public void displayValues() {
        System.out.println("Number of floors: " + numberOfFloors);
        System.out.println("Year of construction: " + yearBuilt);
        System.out.println("Name: " + name);
    }

    public int getYearsSinceBuilt() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - yearBuilt;
    }
}
