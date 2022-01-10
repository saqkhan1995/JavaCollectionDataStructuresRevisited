package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class aQueuesDemo {

    public static void main(String[] args) {


        Queue<String> queue = new LinkedList<>();

        //Queue Operations:
        // ---------------------------------------------------------------
        // |  Operation    | Throws Exception   | Returns Special Value  |
        // ---------------------------------------------------------------
        // | Insert        | add(e)             |  offer(e)              |
        // | Remove        | remove(e)          |  poll(e)               |
        // | Examine       | element(e)         |  peek(e)               |
        // ---------------------------------------------------------------

        //FIFO - First in First out
        queue.add("Dwight");       //Can also use offer() method -> only inserts if possible(capacity restrictions) & doesn't throw exception
        queue.add("Jim");
        queue.add("Michael");
        queue.add("Pam");
        queue.add("Ryan");
        queue.add("Kelly");

        //check/examine the first item in the queue
        System.out.println("Check Item: " + queue.element()); // Check Item: Dwight

        //Removes First item insterted into the queue
        System.out.println("Removing Item: " + queue.remove());  // Removing item: Dwight

        //Because of the Iterable interface, we can make use of "for-each" loop
        for (String s: queue) {
            System.out.println(s);
        }

        //Ideal way to remove items is used with while loops:
        while (!queue.isEmpty()) {   //removes all items here because of the loop
            System.out.println(queue.remove());
        }
    }
}
