package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ll23 {
    public void convertToArrayList(LinkedList<Integer> list)
    {
        List<Integer> arrayList = new ArrayList<Integer>(list);

        System.out.println(arrayList);
    }
}
