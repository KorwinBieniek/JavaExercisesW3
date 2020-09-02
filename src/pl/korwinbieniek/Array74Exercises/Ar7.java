package pl.korwinbieniek.Array74Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Ar7 {
    public void deleteSpecificElement(ArrayList<Integer> list, int val)
    {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == val)
                list.remove(i);
        }
        for(int value : list)
            System.out.println(value);
    }
}
