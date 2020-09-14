package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.util.Calendar;

public class Date26 {
    public void informationAboutMonth(int month)
    {
        Calendar cal = Calendar.getInstance();

        System.out.println(month);
        cal.set(Calendar.MONTH, month-1);
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
