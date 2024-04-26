package lesson6;

import Lesson2.Car;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Field[] decFields = car.getClass().getDeclaredFields();

        for (Field decField : decFields) {
            System.out.println(decField.getName());
        }

        Annotation[] decAnn = car.getClass().getDeclaredAnnotations();
        System.out.println(Arrays.toString(decAnn));

        Parent parent = new Parent();
        Parent child = new Child();
        Parent anotherChild = new AnotherChild();

        Child child1 = new Child();
        ((Parent)child1).print();

        // ((Child)parent).print(); // java.lang.ClassCastException

        Object obj = new Parent();
        Moveable bus = new Bus();
        printTN(bus);
        Transport bus2 = new Plane(1,1,true);
        printTN(bus2);
    }

    public static void someMethod(Object obj) {
        if (obj instanceof Parent) {
            // System.out.println(((Parent) obj).print());
        }
    }

    public static void printTN (Moveable moveable) {
        moveable.printTransportName();
    }

    public static void printTN (Transport transport) {
        transport.printTransportName();
    }
}
