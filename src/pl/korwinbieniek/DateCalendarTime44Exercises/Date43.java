package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.util.Collections;
import java.util.List;

public class Date43 {
    public void displayTimezonesUTC_GMT()
    {
        //DateTimes is unofficial library not included
        List timezones7 = DateTimes.fetchTimeZones7(DateTimes.OffsetType.UTC);
        List timezones8 = DateTimes.fetchTimeZones8(DateTimes.OffsetType.UTC);

        Collections.sort(timezones8);
        timezones8.forEach(System.out::println);
    }


}
