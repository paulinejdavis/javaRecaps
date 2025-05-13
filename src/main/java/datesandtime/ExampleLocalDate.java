package datesandtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class ExampleLocalDate {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDate ld1 = LocalDate.of(2025, 1, 1);
        LocalDate ld2 = LocalDate.parse("2025-04-04");

        System.out.println(ld + " " + ld1 + " " + ld2);

        //2025-04-17 2025-01-01 2025-04-04

        LocalDate ld3 = ld.plusDays(5);
        System.out.println(ld);

        System.out.println(ld3.getDayOfMonth());
        /*
2025-04-17 2025-01-01 2025-04-04
2025-04-17
22*/
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(06, 30, 00);
        LocalTime lt3 = LocalTime.parse("23:00:00");

        System.out.println(lt1 + " " + lt2 + " " + lt3);
        //17:56:19.445430 06:30 23:00

        LocalTime lt4 = lt1.plusHours(2);
        System.out.println(lt4);
        //19:58:46.498638
    }
}
