package concurrentprogramming;

import java.util.concurrent.atomic.AtomicInteger;

public class ExampleAtomicInteger {


    private static AtomicInteger counter = new AtomicInteger(0);
    //private static Integer counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.getAndIncrement(); //atomic operation
//                counter = counter + 1;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.getAndIncrement(); //Atomic operation
                //counter = counter + 1;
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter value: " + counter);

    }
}
