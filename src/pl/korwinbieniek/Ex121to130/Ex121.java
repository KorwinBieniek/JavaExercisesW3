package pl.korwinbieniek.Ex121to130;

import java.util.LinkedList;

public class Ex121 {

    public static void addToLinkedList(LinkedList<Integer> llist)
    {
        for (int i = 0; i < 10; i++) {
            llist.add(i);
        }
    }

    public void reverseLinkedList(LinkedList<Integer> llist)
    {
        LinkedList<Integer> revllist = new LinkedList<Integer>();
        addToLinkedList(llist);

        for (int i = llist.size()-1; i >= 0.; i--) {
            revllist.add(llist.get(i));
        }
        for (int i = 0; i < revllist.size(); i++) {
            System.out.print(revllist.get(i) + " ");
        }

    }
}
