package pl.korwinbieniek.Method16Exercises;

import java.util.Calendar;
import java.util.Date;

public class Met15 {
    public void todayDate()
    {
        Calendar now = Calendar.getInstance();
        System.out.println("Current full date and time is : " + (now.get(Calendar.MONTH) + 1) + "-"
                + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR) + " "
                + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE));
    }
}
