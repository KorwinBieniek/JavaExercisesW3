package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Date33 {
    public void getNextPreviousFriday()
    {
        LocalDate now = LocalDate.now();

        System.out.println(now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println(now.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
    }
}
