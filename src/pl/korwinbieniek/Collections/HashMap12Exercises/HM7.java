package pl.korwinbieniek.Collections.HashMap12Exercises;

import java.util.HashMap;
import java.util.Map;

public class HM7 {
    public void containsSpecificKey(HashMap<Integer, String> hm, int value)
    {
        for(Map.Entry<Integer, String> element : hm.entrySet())
        {
            if(element.getKey() == value)
                System.out.println(element.getValue());
        }
    }
}
