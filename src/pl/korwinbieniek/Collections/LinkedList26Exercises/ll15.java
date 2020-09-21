package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;

public class ll15 {
    public void swapTwoElementsInLinkedList(LinkedList<Integer> list, int position1, int position2)
    {
        int temp = list.get(position1);
        list.set(position1, list.get(position2));
        list.set(position2, temp);

        System.out.println(list);
    }
}
