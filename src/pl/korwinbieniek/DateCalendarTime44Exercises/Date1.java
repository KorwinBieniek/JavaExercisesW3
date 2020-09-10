package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.util.Calendar;
import java.util.Date;

public class Date1 {
    public Date createDataObject(int year, int month, int date)
    {
        month -= 1;

        Calendar cal = Calendar.getInstance();

        cal.clear();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);

        return cal.getTime();
    }
}
