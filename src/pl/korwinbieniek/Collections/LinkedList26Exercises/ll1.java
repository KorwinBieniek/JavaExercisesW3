package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;
import java.util.List;

public class ll1 {
    public void appendAtTheEnd(int val)
    {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.add(list.size(), val);

        System.out.println(list);
    }
}
