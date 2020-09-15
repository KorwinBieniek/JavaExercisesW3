package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Date36 {
    public void unixTimestampToDate()
    {
        long unix_seconds = 1372339860;

        Date date = new Date(unix_seconds*1000L);

        SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM:dd HH-mm/ss z");
        jdf.setTimeZone(TimeZone.getTimeZone("GMT-4"));
        String java_date = jdf.format(date);
        System.out.println(java_date);
    }
}
