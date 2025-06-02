package concurrentprogramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
    public static void main(String[] args) {
        //we create a thread pool with 2 threads

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
        Runnable task2 = () -> System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
        Runnable task3 = () -> System.out.println("Executing Task3 inside : " + Thread.currentThread().getName());
        Runnable task4 = () -> System.out.println("Executing Task4 inside : " + Thread.currentThread().getName());


        //these tasks will be executed by 2 threads concurrently
        //so the total number of active threads will not exceed the limit of 2
        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);
        executor.submit(task4);

        executor.shutdown(); //this will make the executor not accept any new tasks
    }
}
