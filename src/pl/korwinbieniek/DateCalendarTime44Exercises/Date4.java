package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.util.Calendar;

public class Date4 {
    public void getMinimalValue()
    {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.getActualMinimum(Calendar.YEAR));
        System.out.println(cal.getActualMinimum(Calendar.MONTH));
        System.out.println(cal.getActualMinimum(Calendar.WEEK_OF_YEAR));
        System.out.println(cal.getActualMinimum(Calendar.DATE));
    }
}
