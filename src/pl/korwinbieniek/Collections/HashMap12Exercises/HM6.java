package pl.korwinbieniek.Collections.HashMap12Exercises;

import java.util.HashMap;

public class HM6 {
    public void copyHashMap(HashMap<Integer,String> hm)
    {
        HashMap<Integer,String> copyMap = new HashMap<>();

        copyMap = (HashMap<Integer, String>) hm.clone();

        System.out.println(copyMap);
    }
}
