package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;

public class AL7 {
    public boolean findSpecificElement(int element)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int x = 0;

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        System.out.println(list);

        while(list.get(x) != element)
        {

            x++;
        }

        if(list.get(x) == element)
            return true;
        return false;
    }
}
