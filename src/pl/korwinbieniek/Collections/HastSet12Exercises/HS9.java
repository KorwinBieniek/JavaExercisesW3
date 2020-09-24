package pl.korwinbieniek.Collections.HastSet12Exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HS9 {
    public void HashSetToList(HashSet<String> hs)
    {
        ArrayList<String> list = new ArrayList<>(hs);

        System.out.println(list);
    }
}
