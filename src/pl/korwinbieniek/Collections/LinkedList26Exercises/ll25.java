package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;

public class ll25 {
    public void isLinkedListEmpty(LinkedList<Integer> list)
    {
        System.out.println(list);
        System.out.println(list.isEmpty());

        list.removeAll(list);
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
