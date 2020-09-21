package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;
import java.util.List;

public class ll6 {
    public void insertAsFirstAndSecond(int value)
    {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

        list.add(0, value);
        list.add(list.size(), value);

        System.out.println(list);
    }
}
