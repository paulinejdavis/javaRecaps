package datestimes;

import java.time.*;

public class ZonedDateTimeDurationPeriodExample {
    public static void main(String[] args) {
        ZonedDateTime overseasEvent = ZonedDateTime.of(2023, 11,21,10,30,0,0, ZoneId.of("Asia/Tokyo"));
        System.out.println("Zone date details: " + overseasEvent);

        //the duration between two LocalTime objects. One representing 9AM and the other representing 5PM.

        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 0);
        Duration duration = Duration.between(start, end);
        System.out.println("Duration: " + duration);

        //the period between two LocalDate objects. One being January 1st 2023 and the other December 31 2023.
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period);

    }
}
