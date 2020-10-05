package pl.korwinbieniek.Basic_Exercises.Ex171to180;

import java.util.LinkedList;

public class Ex175 {
    public String deleteChosenNode(LinkedList<Integer> list, int node)
    {
        list.remove(node);
        return list.toString();
    }
}
