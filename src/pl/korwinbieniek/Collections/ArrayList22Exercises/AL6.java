package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;

public class AL6 {
    public void removeThirdElement()
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        list.remove(3);

        for(int val : list)
        {
            System.out.println(val);
        }
    }
}
