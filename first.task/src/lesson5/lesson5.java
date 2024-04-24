package lesson5;

import Lesson2.Car;

public class lesson5 {
    public static void main(String[] args) {
        String str1 = "JAVA";
        String str2 = new String("JAVA");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));


        str1 = str1.concat(" DEVELOPER");
        str1 += 123;

        System.out.println(str1);

        int len = str1.length();
        System.out.println(len);

        String sub = str1.substring(3);
        System.out.println(sub);
        sub = str1.substring(2);
        System.out.println(sub);
        String x = "\"Double quote test\"";
        Integer i = Integer.parseInt("11");
        String s = i.toString();
        s = String.valueOf(i);
        String s2 = "SE{s}";
        String javaVersion = String.format("Java version %d, %s", i, s2);
        System.out.println(javaVersion);

        StringBuilder builder1 = new StringBuilder(str2);
        StringBuilder builder2 = new StringBuilder(str2);
        System.out.println(str2 == builder1.toString());
        System.out.println(builder1 == builder2);
        System.out.println(builder1.equals(builder2));
        System.out.println(str2.equals(builder2.toString()));
        System.out.println(str2.equals(builder2));

        Car car = new Car("Lada", "Vesta");
        Car car2 = new Car("Lada", "Vesta");
        System.out.println(car.equals(car2));

        for(String str: x.split(" ")) {
            builder1.append(", ").append(str);
        }

        System.out.println(builder1.toString());
    }
}
