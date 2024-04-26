package lesson6;

public interface Moveable {
    public static final String NAME = "Brand";
    public abstract void printTransportName();
    String transportName();
    public default void someMethod() {
        System.out.println("someMethod");
    }
    public static void staticMethod() {
        System.out.println("staticMethod");
    }
}
