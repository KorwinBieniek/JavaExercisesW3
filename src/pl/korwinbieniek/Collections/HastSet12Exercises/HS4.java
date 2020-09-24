package pl.korwinbieniek.Collections.HastSet12Exercises;

import java.util.HashSet;

public class HS4 {
    public HashSet<String> emptyHashSet(HashSet<String> hs)
    {
        hs.removeAll(hs);
        return hs;
    }
}
