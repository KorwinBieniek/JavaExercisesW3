package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;
import java.util.List;

public class AL12 {
    public void extractPortionOfList(int index)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            list.add(i);
        }

        List<Integer> sublist = list.subList(0,index);

        System.out.println(sublist);
    }
}
