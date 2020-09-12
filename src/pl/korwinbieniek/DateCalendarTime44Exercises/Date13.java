package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.util.Calendar;

public class Date13 {
    public void getDayOfTheWeek()
    {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
    }
}
