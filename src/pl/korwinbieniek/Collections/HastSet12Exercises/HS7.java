package pl.korwinbieniek.Collections.HastSet12Exercises;

import java.util.Arrays;
import java.util.HashSet;

public class HS7 {
    public void convertHashSetToArray(HashSet<String> hs)
    {
        String[] arr = new String[hs.size()];
        hs.toArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}
