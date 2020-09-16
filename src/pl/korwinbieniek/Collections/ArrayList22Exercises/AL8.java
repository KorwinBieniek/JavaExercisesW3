package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;
import java.util.Collections;

public class AL8 {
    public void sortArrayList()
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(5532);
        list.add(325);
        list.add(124125);
        list.add(55321);
        list.add(115);
        list.add(1);

        Collections.sort(list);

        System.out.println(list);
    }
}
