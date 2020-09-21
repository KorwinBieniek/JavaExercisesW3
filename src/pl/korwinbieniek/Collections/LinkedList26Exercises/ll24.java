package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.LinkedList;

public class ll24 {
    public void compareTwoLinkedLists(LinkedList<Integer> list)
    {
        LinkedList<Integer> compareToList = new LinkedList<>(list);
        LinkedList<String> yesOrNo = new LinkedList<>();

        compareToList.remove(4);

        int x= 0;

        for(int value: list)
        {
                yesOrNo.add(compareToList.contains(value) ? "Yes" : "No");
        }

        System.out.println(yesOrNo);

    }
}
