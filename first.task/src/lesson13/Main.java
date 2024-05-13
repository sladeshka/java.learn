package lesson13;

public class Main {
    public static void main(String[] args) {
        Thread myRunnable = new Thread(new MyRunnable());
        MyThread myThread = new MyThread();
        myRunnable.start();
        myThread.start();
        try {
            myRunnable.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        myThread.interrupt();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        new MyThread2();
        new MyThread2();
        new MyThread2();
        new MyThread2();
        new MyThread2();

        myThread.setDaemon(true);
    }
}
