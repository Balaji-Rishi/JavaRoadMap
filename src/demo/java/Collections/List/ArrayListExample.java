package demo.java.Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util. *;


//The Java Collections Framework (JCF) provides a set of classes 
//and interfaces to store, manipulate, and process data efficiently.
//It includes List, Set, Queue, and Map interfaces.

//Implements: ArrayList, LinkedList, Vector
//Allows: Duplicate values
//Insertion Order: Maintained

//1️ ArrayList – Uses a dynamic array (fast for retrieval).
//2️ LinkedList – Uses a doubly linked list (fast for insertions/deletions).
//3️ Vector – Similar to ArrayList but thread-safe.

public class ArrayListExample {

	 public static void main(String[] args) {
		  // Using ArrayList
	        List<String> arrayList = new ArrayList<>();
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        System.out.println("ArrayList: " + arrayList);
	        
	        // Using LinkedList
	        List<String> linkedList = new LinkedList<>();
	        linkedList.add("Dog");
	        linkedList.add("Cat");
	        System.out.println("LinkedList: " + linkedList);

	        // Using Vector
	        List<String> vector = new Vector<>();
	        vector.add("One");
	        vector.add("Two");
	        System.out.println("Vector: " + vector);
	        
	    }
	 
}
