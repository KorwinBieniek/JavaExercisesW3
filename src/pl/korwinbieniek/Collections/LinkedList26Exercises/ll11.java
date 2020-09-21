package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;

public class ll11 {
    public void displayListAndIndexes()
    {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i+1);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Number " + list.get(i) + " and its position " + i);
        }
    }
}
