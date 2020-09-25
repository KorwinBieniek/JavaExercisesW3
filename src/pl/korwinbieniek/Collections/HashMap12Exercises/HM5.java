package pl.korwinbieniek.Collections.HashMap12Exercises;

import java.util.HashMap;
import java.util.Map;

public class HM5 {
    public void hasKey(HashMap<Integer,String> hm)
    {
        for(Map.Entry<Integer, String> value : hm.entrySet())
            System.out.println(hm.isEmpty());
    }
}
