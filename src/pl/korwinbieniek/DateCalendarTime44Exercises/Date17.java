package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.util.Calendar;

public class Date17 {
    public void getNextAndPreviousYear()
    {
        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.YEAR, 1);
        System.out.println(cal.getTime());
        cal.add(Calendar.YEAR, -2);
        System.out.println(cal.getTime());
    }
}
