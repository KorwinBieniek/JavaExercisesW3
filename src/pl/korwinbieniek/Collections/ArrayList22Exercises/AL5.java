package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;

public class AL5 {
    public void changeSpecificElement(int position, int value)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        list.set(position, value);

        for(int val : list)
        {
            System.out.println(val);
        }
    }
}
