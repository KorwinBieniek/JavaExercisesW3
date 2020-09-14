package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.LocalTime;

public class Date27 {
    public void informationAboutTime()
    {
        LocalTime time = LocalTime.of(12,24,32);

        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
    }
}
