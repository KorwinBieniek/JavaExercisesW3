package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.LocalDate;
import java.time.LocalTime;

public class Date40 {
    public void displayTimeWithWithoutDate()
    {
        LocalDate now = LocalDate.now();
        LocalTime timeNow = LocalTime.now();

        System.out.println("Date " + now + " Time " + timeNow);
    }
}
