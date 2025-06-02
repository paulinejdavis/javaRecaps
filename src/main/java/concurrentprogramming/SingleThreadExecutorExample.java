package concurrentprogramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable task1 = () -> System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
        Runnable task2 = () -> System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
        Runnable task3 = () -> System.out.println("Executing Task3 inside : " + Thread.currentThread().getName());

        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);

        executor.shutdown(); //this will make the executor not accept any new tasks
    }
}
