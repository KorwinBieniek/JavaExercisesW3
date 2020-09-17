package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;
import java.util.Collections;

public class AL11 {
    public void reverseArrayListOrder()
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 11; i++) {
            list.add(i);
        }

        int temp = 0;
        int x = list.size()-1;

        System.out.println(list);

        for (int i = 0; i < list.size()/2; i++) {
            temp = list.get(x);
            list.set(x, list.get(i));
            list.set(i, temp);
            x--;
        }

        System.out.println(list);
    }
}
