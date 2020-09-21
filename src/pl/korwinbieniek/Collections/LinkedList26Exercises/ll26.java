package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;

public class ll26 {
    public void replaceAnElement(LinkedList<Integer> list, int oldElement, int newElement)
    {
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == oldElement)
            {
                list.set(i, newElement);
            }
        }

        System.out.println(list);

    }
}
