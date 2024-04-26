package lesson6;

public abstract class Transport implements Moveable {
    private Integer w;
    private Integer s;
    private Boolean i;

    public Transport(Integer w, Integer s, Boolean i) {
        this.w = w;
        this.s = s;
        this.i = i;
    }

    protected abstract void abstractMethod();
    public void info() {

    }
}
