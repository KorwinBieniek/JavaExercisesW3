package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.util.Calendar;

public class Date7 {
    public void getLastDateOfTheMonth()
    {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(cal.getTime());
    }
}
