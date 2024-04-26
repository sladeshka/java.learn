package lab3;

public class Tree {
    public String name;
    public int age;
    public boolean isAlive;

    public Tree() {

    }

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tree(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }
}