package pl.korwinbieniek.Collections.HastSet12Exercises;

import java.util.HashSet;

public class HS10 {
    public void compareHashSets(HashSet<String> hs)
    {
        HashSet<String> hs2 = new HashSet<>(hs);

        hs2.remove("String1");

        HashSet<String> container = new HashSet<>();

        for(String element : hs)
        {

                System.out.println(hs2.contains(element) ? "Yes" : "No");
        }
    }
}
