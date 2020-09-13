package pl.korwinbieniek.DateCalendarTime44Exercises;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Date21 {
    public void getAllTimeZones()
    {
        ZoneId.SHORT_IDS.keySet().stream().forEach(zoneKey -> System.out.println(" " + ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey) ) + ": " + LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey)))));
    }
}
