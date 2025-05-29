package concurrentprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread:" + Thread.currentThread().getId());
        MyThread myThread = new MyThread();
        myThread.start();//this line kicks off the new thread

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        Runnable myRunnable2 = () -> System.out.println("Hello from a lambda Runnable!");
        Thread thread2 = new Thread(myRunnable);
        thread.start();
    }
}
