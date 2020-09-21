package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;

public class ll13 {

    public void deleteFirstAndLast(LinkedList<Integer> list)
    {
        list.remove(0);
        list.remove(list.size()-1);

        System.out.println(list);
    }
}
