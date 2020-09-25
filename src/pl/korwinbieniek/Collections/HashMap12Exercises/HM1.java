package pl.korwinbieniek.Collections.HashMap12Exercises;

import java.util.HashMap;
import java.util.Map;

public class HM1 {
    public void associateKeyWithValue(HashMap<Integer,String> hm)
    {
        for(Map.Entry x : hm.entrySet())
            System.out.println(x.getKey() + " " + x.getValue());
    }
}
