package concurrentprogramming;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Count {

    static int counter = 0;

    private static final Lock lock = new ReentrantLock();


    static synchronized void incrementCounter() {
        if(lock.tryLock()) {
            try {
                int current = counter;
                System.out.println("Before: " + counter + ", Current thread : " + Thread.currentThread().getId());
                counter = current + 1;
                System.out.println("After: " + counter);
            } finally {
                lock.unlock();//always unlock in finally
            }

        } else {
            System.out.println("Other tasks. ");
        }

    }

    public static void main(String[] args) {
        for(int i =0; i < 10; i++) {
            new Thread(Count::incrementCounter).start();
        }
    }
}
