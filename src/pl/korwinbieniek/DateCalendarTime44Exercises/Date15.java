package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.LocalTime;

public class Date15 {
    public void addToLocalTime(int x)
    {
        LocalTime lt = LocalTime.now();

        System.out.println("Local time now: " + lt);
        LocalTime addHours = lt.plusHours(x);
        System.out.println("Local time in " + x + " hours: " + addHours);
    }
}
