package lab3;

import java.util.Arrays;

public class lab3 {
    public static void lab3(String[] args) {
        // first task
        Study study = new Study();
        study.setCourse("Learning Java made easy!");
        System.out.println(study.printCourse());
        // second task
        Car car1 = new Car("Eggplant");
        car1.setName("Lada");
        car1.setWeight(100500);
        car1.displayDetails();
        Car car2 = new Car("White", 100500);
        car2.setName("Automobile");
        car2.displayDetails();
        // third task
        House house1 = new House();
        house1.setValues(2, 2000, "House 1");
        House house2 = new House();
        house2.setValues(3, 2010, "House 2");
        house1.displayValues();
        System.out.println("Number of years since construction: " + house1.getYearsSinceBuilt());
        house2.displayValues();
        System.out.println("Number of years since construction: " + house2.getYearsSinceBuilt());
        // fourth task
        Tree tree1 = new Tree();
        Tree tree2 = new Tree("Oak", 500);
        Tree tree3 = new Tree("Birch", 5, true);
    }
}
