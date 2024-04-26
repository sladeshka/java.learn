package lesson6;

public class Parent {
    public Parent(String name) {
    }

    public Parent() {
        
    }

    public void print() {
        System.out.println("Method from" + this.getClass().getSimpleName());
    }
}
