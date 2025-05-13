package datesandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExampleFormatting {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate today = LocalDate.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/yy");
        System.out.println(dtf.format(now));
        System.out.println((today));

/*Apr/17/25
2025-04-17*/
    }
}
