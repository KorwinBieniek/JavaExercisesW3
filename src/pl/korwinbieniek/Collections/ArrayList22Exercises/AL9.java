package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;

public class AL9 {
    public void copyArrayList()
    {
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            list1.add(i);
        }

        ArrayList<Integer> list2 = new ArrayList<>(list1);

        System.out.println(list2);
    }
}
