package datestimes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTimeFormattingParsingExample {


    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:MM");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);


    }
}
