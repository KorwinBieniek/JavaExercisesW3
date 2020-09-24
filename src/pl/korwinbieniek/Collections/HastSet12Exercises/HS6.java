package pl.korwinbieniek.Collections.HastSet12Exercises;

import java.util.HashSet;

public class HS6 {
    public void cloneHashSet(HashSet<String> hs)
    {
        HashSet<String> cloneHs = new HashSet<>(hs);

        System.out.println(cloneHs);
    }
}
