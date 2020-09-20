package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;

public class AL20 {
    public void increaseListSize()
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(1);

        list.ensureCapacity(6);

        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);

        System.out.println(list);
    }
}
