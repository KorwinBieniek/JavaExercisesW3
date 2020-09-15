package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.util.Calendar;

public class Date34 {
    public void todaysMidnight()
    {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        System.out.println(cal.getTime());
    }
}
