package pl.korwinbieniek.Collections.HashMap12Exercises;

import java.util.HashMap;
import java.util.Set;

public class HM9 {
    public void setViewForHashMap(HashMap<Integer,String> hm)
    {
        Set set = hm.entrySet();

        System.out.println("Set values: " + set);
    }
}
