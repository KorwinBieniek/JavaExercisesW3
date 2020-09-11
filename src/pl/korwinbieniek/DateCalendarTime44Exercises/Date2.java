package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.util.Calendar;

public class Date2 {
    public void defaultDate()
    {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
    }
}
