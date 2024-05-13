package lesson13;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Runnable " + Thread.currentThread().getName() + " i = " + i);
            i++;
        }
    }
}
