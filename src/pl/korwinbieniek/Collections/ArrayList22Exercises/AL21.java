package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;

public class AL21 {
    public void replaceSecondElement(int value)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        list.set(1, value);

        System.out.println(list);
    }
}
