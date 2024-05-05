package lab6;

public class SubClass extends MainClass {
    public void printNumber() {
        System.out.println(number);
    }
    @Override
    public String enterUserInfo() {
        System.out.print("Enter your username: ");
        return scanner.nextLine();
    }
    public void printUserName() {
        String name = enterUserInfo();
        System.out.println("Username: " + name);
    }
}