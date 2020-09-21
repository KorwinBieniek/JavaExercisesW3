package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;

public class ll8 {
    public void addAtTheEnd(int value)
    {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

        list.remove(list.size()-1);
        list.add(list.size(), value);

        System.out.println(list);
    }
}
