package lesson13;

public class MyThread2 extends Thread{
    public MyThread2() {
        this.start();
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "1");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "2");
    }
}
