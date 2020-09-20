package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;
import java.util.Collections;

public class AL16 {
    public void copyArray()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();



        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        ArrayList<Integer> copy = new ArrayList<Integer>(list);

        System.out.println(copy);
    }
}
