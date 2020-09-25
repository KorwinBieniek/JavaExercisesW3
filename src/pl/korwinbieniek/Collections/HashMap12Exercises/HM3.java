package pl.korwinbieniek.Collections.HashMap12Exercises;

import java.util.HashMap;

public class HM3 {
    public void copyHashMap(HashMap<Integer, String> hm)
    {
        HashMap<Integer,String> hm2 = new HashMap<>(hm);

        System.out.println(hm2);
    }
}
