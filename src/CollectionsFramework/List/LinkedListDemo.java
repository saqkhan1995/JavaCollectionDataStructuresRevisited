package CollectionsFramework.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        //LinkedList in java is a "Doubly-linked List" (not Circular), last item null

        list1.add(1);
        list1.add(10);
        list1.add(5);
        list1.add(3);

        for (Integer i: list1) {
            System.out.println(i);
        }

        //LinkedLists - easy to manipulate first & last items or intermediate items quite efficiently
        list1.addFirst(15);
        list1.addLast(20);
    }
}
