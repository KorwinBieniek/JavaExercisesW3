package pl.korwinbieniek.Collections.HastSet12Exercises;

import java.util.HashSet;
import java.util.TreeSet;

public class HS8 {
    public void convertToTreeSet(HashSet<String> hs)
    {
        TreeSet<String> ts = new TreeSet<>(hs);

        for(String element : ts)
            System.out.println(element);
    }
}
