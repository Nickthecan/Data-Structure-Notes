// LinkedList = stores Nodes in 2 parts (data, address)
//              nodes are in non-consective memory locations
//              Elements are linked using pointers
//
//                            Singly Linked List
//              Node                Node                Node
//         [data | address] -> [data | address] -> [data | address]
//
//                            Doubly Linked List
//                   Node                              Node
//        [address | data | address]   <->  [address | data | address]

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        //creating a LinkedList object
        LinkedList<String> list = new LinkedList<>();

        //pushing elements like a stack into the LinkedList
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("F");
        list.pop();

        //offering elements like a queue into the LinkedList
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        list.offer("F");
        list.poll();

        //adding elements in the LinkedList
        list.add(4, "E");
        
        //removing elements in the LinkedList
        list.remove("E");
        System.out.println(list);

        //peeking at the front of the LinkedList
        System.out.println(list.peekFirst());

        //peeking at the back of the LinkedList
        System.out.println(list.peekLast());

        //adding to the front and the back
        list.addFirst("A");
        list.addLast("A");

        System.out.println(list);

        //removing from the front and the back
        String first = list.removeFirst();
        String last = list.removeLast();

        System.out.println(first + " " + last);

        //uses of Linked List
        //1. Dynamic Data Structure (allocates needed memory while running)
        //2. Insertion and Deletion of Nodes is easy. O(1)
        //3. No/Low memory waste
    }
}
