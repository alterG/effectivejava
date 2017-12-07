package concurrency;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class ConcurrentIncrement {

    private static volatile int value = 0;
    private static Semaphore sem = new Semaphore(1);

    private static void next() throws InterruptedException {
        sem.acquire();
        value++;
        sem.release();
    }

    public static void main(String[] args) throws InterruptedException {

        Set<Thread> threads = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    try {
                        next();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Final value is " + value);

    }
}
