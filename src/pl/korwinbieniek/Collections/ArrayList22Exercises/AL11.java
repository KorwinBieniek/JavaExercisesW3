package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;
import java.util.Collections;

public class AL11 {
    public void reverseArrayListOrder()
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        int temp = list.get(0);
        int x = 0;

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);
    }
}
