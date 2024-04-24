package lesson7;

public class Outer {
    private int a;
    private int b;

    static String name = "Name";

    void setParams(final int x, final int y){
        this.a = x;
        this.b = y;
    }

    class Inner {
        void method() {
            setParams(4,6);
            System.out.println("sum = " + (a + b));
        }
    }

    public void innerMethodCall(){
        Inner inner = new Inner();
        inner.method();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.innerMethodCall();
    }

    static class NestedStatic {
        void nestedStatic () {
            System.out.println(name);
//            System.out.println("sum = " + (a + b));
        }
    }
}
