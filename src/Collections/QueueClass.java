package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {

        //--------------QUEUE ----------------
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(19);
        q2.add(89);
        q2.add(65);
        q2.add(86);
        q2.add(30);
        System.out.println(q2);

        System.out.println("Element removed from queue: "+ q2.remove());

        System.out.println("Top of the queue: "+q2.peek());

        //Poll: returns and removes the element at the front end
        System.out.println("Polled element: "+q2.poll());

        System.out.println(q2);



        //--------Periority queue --------


        // Create a PriorityQueue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the queue
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(15);

        // Remove and print the elements in priority order (lowest first)
        System.out.println("Priority Queue (in order of priority):");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());  // Removes and prints the element with the highest priority (smallest)
        }

    }
}
