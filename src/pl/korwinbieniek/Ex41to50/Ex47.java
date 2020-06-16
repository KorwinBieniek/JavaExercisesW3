package pl.korwinbieniek.Ex41to50;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex47 {
    public void returnTimeFormatted()
    {
        SimpleDateFormat cdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

        System.out.println("\nCurrent time: "+cdt.format(System.currentTimeMillis()));
    }
}
