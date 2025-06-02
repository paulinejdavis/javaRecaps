package concurrentprogramming;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledUpdates {
    public static void main(String[] args) {
        //creates a scheduled with a pool size of 1
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        //runnable task to send updates
        Runnable updateTask = () -> {
            System.out.println("Sending election updates! Timestamp: " + System.currentTimeMillis() / 1000);
        };


            /*schedule the task to run after intiaitl delay of 0 secs*/
            scheduledExecutorService.scheduleWithFixedDelay(updateTask, 0,2, TimeUnit.SECONDS);

            try {
                //main thread sleeps for 10 secs
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
