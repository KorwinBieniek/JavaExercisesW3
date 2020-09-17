package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;

public class AL15 {
    public void joinTwoLists()
    {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add("vocal" + i);
            list2.add("hocal" + i);
        }

        ArrayList<String> mergedLists = new ArrayList<>(list1);
        mergedLists.addAll(list2);

        System.out.println(mergedLists);
    }
}
