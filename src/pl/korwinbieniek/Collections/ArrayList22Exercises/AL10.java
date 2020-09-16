package pl.korwinbieniek.Collections.ArrayList22Exercises;

import java.util.ArrayList;
import java.util.Collections;

public class AL10 {
    public void shuffleArrayList()
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println("Before shuffling: " + list);
        Collections.shuffle(list);

        System.out.println("After shuffling " + list);
    }
}
