package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;

public class ll22 {
    public boolean checkIfElementExistsInLinkedList(LinkedList<Integer> list, int element)
    {
        for (int value : list) {
            if(value == element)
                return true;
        }
        return false;
    }
}
