package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;

public class ll7 {
    public void addAtFront(int value)
    {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

        list.remove(0);
        list.add(0, value);

        System.out.println(list);
    }
}
