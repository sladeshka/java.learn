package lab11;

class MyRunnable2 implements Runnable {
    Object lock;
    String name;

    public MyRunnable2(String name, Object lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) synchronized (lock) {
            lock.notifyAll();
            try {
                lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }
}
