package pl.korwinbieniek.Array74Exercises;

import java.util.ArrayList;

public class Ar21 {
    public String[] ArrayListToArray()
    {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            list.add(" " + i);
        }

        String[] arr = new String[list.size()];

        return list.toArray(arr);
    }
}
