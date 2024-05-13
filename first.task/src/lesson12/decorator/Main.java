package lesson12.decorator;

public class Main {
    public static void main(String[] args) {
        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        c.doOperation(); // Result of program execution "Hello, World!"
        c.newOperation(); // New hello operation

    }
}
