package lesson6;

public class Child extends Parent implements Moveable
{
    public Child(String name) {
        super(name);
    }

    public Child() {
        super();
    }

    public void printTransportName(){

    }
    public String transportName(){
        return "";
    }
}
