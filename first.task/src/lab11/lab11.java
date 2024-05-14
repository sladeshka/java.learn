package lab11;

import lesson13.MyRunnable;
import lesson13.MyThread;
import lesson13.MyThread2;

import java.util.concurrent.CountDownLatch;

public class lab11 {
    public static void main(String[] args) throws InterruptedException {
        // first task
        firstTask();
        Thread.sleep(2000);
        // second task
        secondTask();
        Thread.sleep(2000);
        // third task
        thirdTask();
        Thread.sleep(2000);
        // fourth task
        fourthTask();
    }
    private static void firstTask() {
        for (int i = 0; i < 10; i++) {
            MyThread thread = new MyThread();
            thread.start();
        }
    }

    private static void secondTask() throws InterruptedException {
        Thread thread2 = new MyThread();
        System.out.println("State before launch: " + thread2.getState());
        thread2.start();
        System.out.println("State after launch: " + thread2.getState());
        Thread.sleep(1000);
        System.out.println("Runtime status: " + thread2.getState());
    }

    private static void thirdTask() {
        Counter counter = new Counter();
        int number = 100;
        CountDownLatch latch = new CountDownLatch(number);
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    synchronized (counter) {
                        counter.increment();
                    }
                }
                latch.countDown();
            });
            threads[i].start();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Count: " + counter.getCount());
    }
    private static void fourthTask() {
        Object lock = new Object();
        new Thread(new MyRunnable2("Thread 1", lock)).start();
        new Thread(new MyRunnable2("Thread 2", lock)).start();
    }
}
