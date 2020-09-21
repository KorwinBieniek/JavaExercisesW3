package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;

public class ll19 {
    public int returnAndRemoveFirstElement(LinkedList<Integer> list)
    {
        int firstElement = list.get(0);
        list.remove(0);

        System.out.println(list);

        return firstElement;
    }
}
