package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;

public class ll9 {
    public void insertFewIntsAtSpecificPosition(int position)
    {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i+1);
        }

        for (int i = position; i < position+10; i++) {
            list.remove(i);
            list.add(i, i*5);
        }

        System.out.println(list);
    }
}
