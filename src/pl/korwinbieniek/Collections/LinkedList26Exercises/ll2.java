package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;
import java.util.List;

public class ll2 {
    public void iterateThroughLinkedList()
    {
        List<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        for(int val : list)
        {
            System.out.print(val + ", ");
        }
    }
}
