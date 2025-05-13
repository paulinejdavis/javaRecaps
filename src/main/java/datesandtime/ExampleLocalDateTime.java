package datesandtime;

import java.time.LocalDateTime;

public class ExampleLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ltdt1 = LocalDateTime.now();
        LocalDateTime ltdt2 = LocalDateTime.of(2000, 6,12, 15, 00,00);
        LocalDateTime ltdt3 = LocalDateTime.parse("2004-11-30T22:12:00");
        System.out.println(ltdt1 + " \n" + ltdt2 + "\n" + ltdt3);
        //2025-04-17T18:08:05.766072 2000-06-12T15:00 2004-11-30T22:12
    }
}
