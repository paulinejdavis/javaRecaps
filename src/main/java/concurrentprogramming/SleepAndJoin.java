package concurrentprogramming;

public class SleepAndJoin {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                System.out.println("Thread will sleep for 2 seconds...");
                Thread.sleep(2000);//pausing for 2 secs
                System.out.println("*Yawn..* I'm awake!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.start();

        Thread t1 = new Thread(() -> {
            System.out.println("t1 started...");
            try {
                Thread.sleep(2000);//pausing for 2 secs
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1 finished!");
        });

        t1.start();

        try {
            System.out.println("Main thread will be waiting for t1 to be done...");
            t1.join();//main thread waits for t1 to ocmplete
            System.out.println("Main thread continues...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
