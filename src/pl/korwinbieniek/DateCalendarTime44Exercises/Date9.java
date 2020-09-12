package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.util.Calendar;

public class Date9 {
    public void getLastDate()
    {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
