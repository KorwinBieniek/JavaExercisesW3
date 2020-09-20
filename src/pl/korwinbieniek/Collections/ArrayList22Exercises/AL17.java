package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL17 {
    public void emptyTheList()
    {
        List<Object> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        System.out.println(list);

        list = Collections.emptyList();
        //or
        //list.removeAll(list);

        System.out.println(list);
    }
}
