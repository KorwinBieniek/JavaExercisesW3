package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.util.Calendar;

public class Date11 {
    public void maxDaysInMonth()
    {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
