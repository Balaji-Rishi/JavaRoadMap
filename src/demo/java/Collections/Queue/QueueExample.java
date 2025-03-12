package demo.java.Collections.Queue;

import java.util.*;

//Implements: LinkedList, PriorityQueue, ArrayDeque
//Allows: Duplicates
//Behavior: Elements are processed in FIFO order.

//1️⃣ LinkedList – Can be used as both Queue and List.
//2️⃣ PriorityQueue – Elements are ordered based on priority (natural ordering or custom comparator).
//3️⃣ ArrayDeque – A double-ended queue (Deque), allows fast insertions/removals at both ends.

public class QueueExample {
	
    public static void main(String[] args) {
       
        
     // Using LinkedList as a Queue (FIFO)
        Queue<String> linkedListQueue = new LinkedList<>();
        linkedListQueue.add("A");
        linkedListQueue.add("B");
        linkedListQueue.add("C");
        System.out.println("LinkedList Queue: " + linkedListQueue);
        System.out.println("Polled: " + linkedListQueue.poll()); // Removes A

        // Using PriorityQueue (Sorted Order)
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        System.out.println("PriorityQueue: " + priorityQueue); // [10, 30, 20]
        System.out.println("Polled: " + priorityQueue.poll()); // Removes 10 (Lowest first)

        // Using ArrayDeque as a Queue
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("X");
        arrayDeque.add("Y");
        arrayDeque.add("Z");
        System.out.println("ArrayDeque Queue: " + arrayDeque);
        System.out.println("Polled: " + arrayDeque.poll()); // Removes X (FIFO)
    }

}
