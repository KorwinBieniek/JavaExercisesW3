package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;

public class AL19 {
    public void trimToSize()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);

        list.trimToSize();
    }
}
