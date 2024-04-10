import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        testJavaTypes();
        Lab1();
    }

    public static void testJavaTypes() {
        byte b= 100;
        short s = 123;
        int i = 100;
        long l = 5000000000000000000L;

        float f = 2.12f;
        double d = 2.2d;
        double d2 = 2.2;

        char c = 'a';
        boolean isTrue = true;

        byte result = (byte)(b + 1);

        System.out.println(result);
        System.out.println("Hello world!");
        int res = i / s;
        System.out.println(res);

        if (true) {
            // logic
        }

        if (true) {
            // logic
        } else  {
            // logic
        }

        if (true) {
            // logic
        } else if (false){
            // logic
        }

        int x = 11;
        int y = 20;

        // x == y;
        // x != y
        // x > y
        // x < y
        // x >= y
        // x <= y
        // x % 2 == 0

        if (x % 2 != 0 && x != y ) {
            System.out.println("Ok");
        }

        if (x % 2 != 0 & x != y ) {
            System.out.println("Ok");
        }

        if (x % 2 != 0 || x != y ) {
            System.out.println("Ok");
        }
        int a = 3;

        int z = a == 3 ? a : a + 5;

        System.out.println(z);

        a = 4;

        z = a == 3 ? a : a + 5;

        System.out.println(z);

        String str = "JAVA";

        System.out.println(str);

        switcher(a);
        String result2 = switcher(a, true);
        System.out.println(result2);

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        int h = scanner.nextInt();

        System.out.println(s1);
        System.out.println(h);
    }

    public static void switcher (int number) {
        int x;
        switch (number) {
            case 10:
                x = number;
                break;
            case 20:
                x = number + number;
                break;
            default:
                x=1000;
                break;
        }
        System.out.println(x);
    }

    public static String switcher (int number, boolean isString) {
        return "String";
    }

    public static void Lab1 () {
        // first task
        System.out.println("I");
        System.out.println("know");
        System.out.println("Java");
        System.out.println("well");
        // second task
        double x = ( 46 + 10 ) * ( 10 / 3 );
        double y = ( 29 ) * ( 4 ) * (- 15 );
        // third task
        int number = 10500;
        double result = (number / 10) / 10;
        // fourth task
        result = 3.6 * 4.1 * 5.9;
        // fifth task
        // 42
        // 100
        // 125
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        System.out.println(s1);
        scanner = new Scanner(System.in);
        s1 = scanner.nextInt();
        System.out.println(s1);
        scanner = new Scanner(System.in);
        s1 = scanner.nextInt();
        System.out.println(s1);
        scanner = new Scanner(System.in);
        s1 = scanner.nextInt();
        String message = s1 % 2 > 0? "Odd" : "Even";
        if(s1 > 100) {
            message = "Out of range";
        }
        System.out.println(message);
        // ! Использовать класс Scanner: int b = scanner.nextInt();
    }
}