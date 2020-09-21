package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;
import java.util.List;

public class ll5 {
    public void insertAtSpecificPosition(int position, int value)
    {
        List<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

        list.add(position, value);

        System.out.println(list);
    }
}
