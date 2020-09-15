package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date35 {
    public void extractDateFromString()
    {
        try
        {
            String str = "2015-05-04 02:22:15";

            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);
            String newstr = new SimpleDateFormat("dd:MM:yy. HH:ss:mm").format(date);
            System.out.println(newstr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
