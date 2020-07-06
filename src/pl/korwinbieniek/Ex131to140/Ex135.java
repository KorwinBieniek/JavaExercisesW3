package pl.korwinbieniek.Ex131to140;

import java.util.LinkedList;

public class Ex135 {
    public LinkedList<Integer> deleteDuplicatedLinkedList(LinkedList<Integer> list)
    {
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) == list.get(i-1))
                list.remove(i);
        }

        return list;
    }
}
