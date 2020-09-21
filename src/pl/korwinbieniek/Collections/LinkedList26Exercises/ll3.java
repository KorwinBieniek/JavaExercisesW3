package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;
import java.util.List;

public class ll3 {
    public void readFromIndex(int index)
    {
        List<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 100; i++) {
            list.add(i+1);
        }

        for (int i = index; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
