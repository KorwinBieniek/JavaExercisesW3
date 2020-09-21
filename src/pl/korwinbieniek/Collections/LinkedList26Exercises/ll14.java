package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;

public class ll14 {
    public void deleteAllInLinkedList(LinkedList<Integer> list)
    {
        list.removeAll(list);

        System.out.println(list);
    }
}
