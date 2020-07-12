package pl.korwinbieniek.Ex141to150;

import java.util.LinkedList;

public class Ex143 {
    public LinkedList<Integer> mergeLists(LinkedList<Integer> list1, LinkedList<Integer> list2)
    {
        list1.addAll(list2);
        return list1;
    }
}
