package lab6;

public abstract class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract void printInfo();
}