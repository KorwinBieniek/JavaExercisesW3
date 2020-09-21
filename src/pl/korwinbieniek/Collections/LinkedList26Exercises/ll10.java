package pl.korwinbieniek.Collections.LinkedList26Exercises;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ll10 {
    public void findFirstLastOccurence(int value)
    {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Random().nextInt(50)+1);
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == value)
            {
                System.out.println("First occurence at " + (i+1) + " position");
                break;
            }

        }

        List<Integer> reversedList = new LinkedList<Integer>(list);
        Collections.reverse(reversedList);

        for (int i = 0; i < reversedList.size(); i++) {
            if(reversedList.get(i) == value)
            {
                System.out.println("Last occurence at " + (reversedList.size()-i-1) + " position");
                break;
            }
        }

        System.out.println(list);
    }
}
