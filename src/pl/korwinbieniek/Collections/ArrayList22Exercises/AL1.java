package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;

public class AL1 {
    public void printArrayList()
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("blue");
        list.add("red");
        list.add("purple");
        list.add("violet");
        list.add("white");

        for(String str : list)
        {
            System.out.println(str);
        }
    }
}
