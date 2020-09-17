package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;

public class AL14 {
    public void swapElements(int element1, int element2)
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("dog");
        list.add("cat");
        list.add("mouse");
        list.add("fly");
        list.add("bee");
        list.add("sheep");
        list.add("gorilla");
        list.add("giraffe");

        String temp = list.get(element1);
        list.set(element1, list.get(element2));
        list.set(element2, temp);

        System.out.println(list);
    }
}
