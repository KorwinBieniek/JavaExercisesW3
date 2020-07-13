package pl.korwinbieniek.Ex141to150;

import java.util.LinkedList;

public class Ex145 {
    public void deleteNth(int n, LinkedList<Integer> list)
    {
        list.remove(list.size()-n);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
