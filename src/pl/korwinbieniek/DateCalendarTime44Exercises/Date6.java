package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.util.Calendar;

public class Date6 {
    public void getFullDate()
    {
        Calendar cal = Calendar.getInstance();

        System.out.print(cal.get(Calendar.MONTH) + "-");
        System.out.print(cal.get(Calendar.DATE) + "-");
        System.out.print(cal.get(Calendar.YEAR) + " ");

        System.out.print(cal.get(Calendar.HOUR) + ":");
        System.out.print(cal.get(Calendar.MINUTE) + ":");
        System.out.print(cal.get(Calendar.SECOND) + ":");
        System.out.print(cal.get(Calendar.MILLISECOND));
    }
}
