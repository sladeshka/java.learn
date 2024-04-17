package lesson3;

public class StaticExample {
    public static final String STATIC_CONSTAT = "static";
    private String string;
    public static String staticString;
    private final String nonStatic;
    protected String protectedStatic;
    Integer number;

    static {
        System.out.println("--");
        staticString = "staticString";
        System.out.println(staticString);
        System.out.println("--");
    }

    {
        System.out.println("--");
        nonStatic = "nonStatic";
        System.out.println(nonStatic);
        System.out.println("--");
    }

    public static void main(String[] args) {
//        StaticExample staticExample = null;
//        staticExample.SomeMethod();
        new StaticExample();
        Integer integer = null;
        String number = "123";
        int i = integer.parseInt(number);
        System.out.println(i);
    }

    public void SomeMethod() {
        // logic
    }
}
