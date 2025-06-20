package concurrentandmultithreading;


public class BasicThreadCreation {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Hello from the thread!");
        });
        thread.start();
    }
}
