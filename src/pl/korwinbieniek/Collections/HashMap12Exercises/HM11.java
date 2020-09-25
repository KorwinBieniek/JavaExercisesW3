package pl.korwinbieniek.Collections.HashMap12Exercises;

import java.util.HashMap;
import java.util.Set;

public class HM11 {
    public void getSetKeyView(HashMap<Integer,String> hm)
    {
        Set set = hm.keySet();

        System.out.println(set);
    }
}
