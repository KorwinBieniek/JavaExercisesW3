package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.util.Calendar;
import java.util.TimeZone;

public class Date5 {
    public void getTimeInNY()
    {
        Calendar cal = Calendar.getInstance();

        cal.setTimeZone(TimeZone.getTimeZone("Poland/Warsaw"));

        System.out.println("Time in Warsaw: " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));

        cal.setTimeZone(TimeZone.getTimeZone("America/New_York"));

        System.out.println("Time in New York: " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
    }
}
