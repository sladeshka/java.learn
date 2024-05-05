package lab6;

public class BankEmployee extends Person {
    private final String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("LastName: " + getLastName());
        System.out.println("Bank name: " + bankName);
    }
}
