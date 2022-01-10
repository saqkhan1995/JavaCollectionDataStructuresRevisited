package Queues;

import Queues.model.Person;

import java.util.PriorityQueue;
import java.util.Queue;

public class bPriorityQueueDemo {

    /**
     *  Based ib a priority heap !!!
     *      We assign a priority value to every single items
     *          -element with high priority is served before an element with low priority
     *          -the elements of the priority queue are ordered according to their natural ordering
     *              defined by the "Comparable" interface (priority is defined by the Comparable interface)
     *
     *  add() -> adds elements to the queue
     *  peek() -> Retrieves, but does noe remove, the head of this queue
     *              or returns null if the queue is empty
     *  poll() -> Retrieves & removes the head of the queue, or returns null if this queue is empty
     */

    public static void main(String[] args) {

        Queue<Person> queue = new PriorityQueue<>();
        //Exception in thread "main" java.lang.ClassCastException: Queues.model.Person cannot be cast to java.lang.Comparable
        //To avoid this, implement the Comparable interface in the model "Person" class (As priority is defined by the Comparable interface)
        //Override the "CompareTo()" method and assign a priority ex. according to age parameter
        queue.add(new Person("Kevin", 22));
        queue.add(new Person("Joe", 37));
        queue.add(new Person("Adam", 12));
        queue.add(new Person("Anna", 45));

        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }
    }
}
