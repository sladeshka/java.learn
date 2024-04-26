package lesson7;

public class Main {
    public static void main(String[] args) {
//        Outer.Inner inner = new Outer.Inner(); // imposible
        Outer.NestedStatic nestedStatic = new Outer.NestedStatic();
        nestedStatic.nestedStatic();
    }
}
