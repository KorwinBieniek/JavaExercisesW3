package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.LocalDateTime;

public class Date28 {
    public void hoursBeforeCurrentTime()
    {
        LocalDateTime dateTime = LocalDateTime.now().minusHours(5).minusMinutes(32);
        System.out.println(LocalDateTime.now());
        System.out.println(dateTime);
    }
}
