package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.util.Calendar;

public class Date3 {
    public void getMaximalValue()
    {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.getActualMaximum(Calendar.YEAR));
        System.out.println(cal.getActualMaximum(Calendar.MONTH));
        System.out.println(cal.getActualMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println(cal.getActualMaximum(Calendar.DATE));
    }
}
