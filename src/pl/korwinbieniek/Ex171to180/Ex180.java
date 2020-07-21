package pl.korwinbieniek.Ex171to180;

import java.util.LinkedList;

public class Ex180 {
    public String swapAdjacentInList(LinkedList<Integer> list)
    {
        int temp = 0;
        for (int i = 1; i < list.size(); i+=2) {
            temp = list.get(i);
            list.set(i, list.get(i-1));
            list.set(i-1, temp);
        }
        return list.toString();
    }
}
