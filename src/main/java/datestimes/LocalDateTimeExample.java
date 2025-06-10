package datestimes;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime theEvent = LocalDateTime.of(2023, Month.NOVEMBER, 21, 18, 30);
        System.out.println("The event is on: " + theEvent);
    }
}
