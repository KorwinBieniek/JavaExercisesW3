package pl.korwinbieniek.Collections.HastSet12Exercises;

import java.util.HashSet;

public class HS11 {
    public void retainSameElement(HashSet<String> hs)
    {
        HashSet<String> hs2 = new HashSet<>(hs);
        hs2.remove("String1");

        hs.retainAll(hs2);

        System.out.println(hs);
    }
}
