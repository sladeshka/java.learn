package lab6;

public class lab6 {
    public static void main(String[] args) {
        // first task
        Client client = new Client("clientFirstName", "clientLastName", "clientBankName");
        client.printInfo();
        BankEmployee bankEmployee = new BankEmployee("bankEmployeeFirstName", "bankEmployeeLastName", "bankEmployeeBankName");
        bankEmployee.printInfo();
        // third task
        Truck truck = new Truck(1000, "Model", 'R', 150.00f, 6, 2000);
        truck.outPut();
        truck.newWheels(10);
        // fourth task
        SubClass obj = new SubClass();
        obj.printNumber();
        // fifth task
        SubClass subClass = new SubClass();
        subClass.printUserName();
    }
}
