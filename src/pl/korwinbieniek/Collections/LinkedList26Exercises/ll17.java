package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;

public class ll17 {
    public void joinTwoLinkedLists(LinkedList<Integer> list)
    {
        LinkedList<Integer> list2 = new LinkedList<>(list);

        list2.addAll(list);

        System.out.println(list2);
    }
}
