package lesson6;

public class Plane extends Transport {
    public Plane(Integer w, Integer s, Boolean i) {
        super(w, s, i);
    }

    @Override
    public void printTransportName() {

    }

    @Override
    public String transportName() {
        return "";
    }

    @Override
    public void someMethod() {
        super.someMethod();
    }

    @Override
    protected void abstractMethod() {

    }
}
