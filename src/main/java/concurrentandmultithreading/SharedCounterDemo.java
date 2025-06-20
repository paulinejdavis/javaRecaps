package concurrentandmultithreading;

public class SharedCounterDemo {
   static  int counter = 0;

    static synchronized void increment() {
        int current = counter;
        System.out.println(current);
        counter = counter + 1;
        System.out.println(counter);

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(SharedCounterDemo::increment).start();
        }
    }
}
