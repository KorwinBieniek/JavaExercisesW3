package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.util.Calendar;

public class Date16 {
    public void addDaysToCalendar(int days)
    {
        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.DAY_OF_YEAR, days);

        System.out.println(cal.getTime());
    }
}
