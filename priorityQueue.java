//Priority Queue = a FIFO data structure that serves elements
//                 with the highest priorities first
//                 before the elements with lower priority

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        //create a priority queue object
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.5);
        queue.offer(2.4);
        queue.offer(4.0);
        queue.offer(1.7);
        queue.offer(1.2); 
        //sorts in greatest to least
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println("========================");
        Queue<String> Pqueue = new PriorityQueue<>();

        Pqueue.offer("Nick");
        Pqueue.offer("Daelen");
        Pqueue.offer("Ben");
        Pqueue.offer("Anna");
        Pqueue.offer("Alex"); 
        //sorts in alphabetical order
        while (!Pqueue.isEmpty()) {
            System.out.println(Pqueue.poll());
        }
    }
}
