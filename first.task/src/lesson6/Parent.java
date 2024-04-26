package lesson6;

public class Parent {
    public void print() {
        System.out.println("Method from" + this.getClass().getSimpleName());
    }
}
