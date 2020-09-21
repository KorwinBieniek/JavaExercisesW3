package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;
import java.util.List;

public class ll4 {
    public void iterateInReverse()
    {
        List<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 50; i++) {
            list.add(i+1);
        }

        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
