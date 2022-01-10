package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class cArrayDequeDemo {

    // Deque -> double ended queue
    // Huge one dimensional array - O(1) spacetime complexity

    //Supports both front & rear insertion/removal ->> addFirst(), addLast(), offerFirst(), offerLast(), peek, poll etc.

    public static void main(String[] args) {

        //FIFO
        /*Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(10);
        queue.offer(100);
        queue.offer(1000);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }*/

        //Deque & Stack are used for better performance

        Deque<Integer> stack = new ArrayDeque<>();

        //LIFO
        stack.push(1);
        stack.push(10);
        stack.push(100);
        stack.push(1000);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    /**
     * because Stack is synchronized (because it extends the Vector class) this is why it is going to be slower than the ArrayDeque solution.
     * So it is advisable to use ArrayDeque if we are after a LIFO structure
     */
}
