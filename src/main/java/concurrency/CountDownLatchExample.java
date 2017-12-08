package concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        Thread t1 = new MyThread(2000, latch);
        Thread t2 = new MyThread(4000, latch);
        Thread t3 = new MyThread(6000, latch);
        t1.start();
        t2.start();
        t3.start();
    }

    static class MyThread extends Thread {

        private int delay;
        private CountDownLatch latch;

        public MyThread(int delay, CountDownLatch latch) {
            this.delay = delay;
            this.latch = latch;
        }

        @Override
        public void run() {
            System.out.println("Thread " + getName() + " is initializing");
            try {
                Thread.sleep(delay);
                latch.countDown();
                latch.await();
                System.out.println("Thread " + getName() + " is doing work");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


