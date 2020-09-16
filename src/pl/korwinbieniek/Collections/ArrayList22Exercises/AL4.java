package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;

public class AL4 {
    public void putElementAtSpecificPosition(int position)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

        System.out.println(list.get(position));
    }
}
