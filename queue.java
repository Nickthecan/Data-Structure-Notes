//Queue = FIFO data structure (First-In, First-Out)
//        A collection designed for holding elements prior to processing
//        Linear data structure
//        add    = enqueue, offer()
//        remove = dequeue, poll()

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        //creating a new queue object using a linked list
        Queue<String> queue = new LinkedList<>();

        //checks if the queue is empty
        System.out.println(queue.isEmpty());

        //add elements into the queue
        queue.offer("Nick");
        queue.offer("Anna");
        queue.offer("Daelen");
        queue.offer("Ben");
        System.out.println(queue);
        
        //checks the size of the queue
        System.out.println(queue.size());

        //checks if the queue contains an element
        System.out.println(queue.contains("Ben"));
        System.out.println(queue.contains("Alex"));

        //peek method to check the head of the queue
        System.out.println(queue.peek());

        //remove an element from the queue
        queue.poll();
        System.out.println(queue);

        //Uses of queues
        //1. Keyboard Buffer (Letters should appear on the screen in the order they're pressed)
        //2. Printer Queue (Print jobs should be completed in order)
        //3. Used in LinkedLists, PriorityQueues, Bread-First search
    }
    
}
