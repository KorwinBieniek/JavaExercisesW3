package pl.korwinbieniek.Collections.HashMap12Exercises;

import java.util.HashMap;
import java.util.Map;

public class HM8 {
    public void containgSpecificValue(HashMap<Integer,String> hm, String value)
    {
        for(Map.Entry<Integer, String> element : hm.entrySet())
        {
            if(element.getValue().equals(value))
                System.out.println(element.getValue() + " " + element.getKey());
        }
    }
}
