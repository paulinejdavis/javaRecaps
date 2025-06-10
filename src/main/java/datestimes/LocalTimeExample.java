package datestimes;


import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime MeetingTime = LocalTime.of(13,30);
        System.out.println("The meeting today is at: " + MeetingTime);
    }
}
