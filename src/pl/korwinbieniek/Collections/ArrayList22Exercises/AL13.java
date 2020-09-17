package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;

public class AL13 {
    public void doesContain()
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("tomato");
        list.add("kiwi");
        list.add("banana");
        list.add("orange");
        list.add("apple");
        list.add("tomato");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("tomato");
        list2.add("banana");
        list2.add("apple");
        list2.add("tomato");
        list2.add("kiwi");

        ArrayList<String> doesContain = new ArrayList<>();
        for(String str : list)
        {
            doesContain.add(list2.contains(str) ? "Yes" : "No");
        }

        System.out.println(doesContain);
    }
}
