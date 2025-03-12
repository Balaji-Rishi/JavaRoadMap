package demo.java.Collections.Map;

import java.util.*;

//Implements: HashMap, LinkedHashMap, TreeMap
//Allows: Duplicate values, but keys must be unique.

//1️⃣ HashMap – Unordered, fast access.
//2️⃣ LinkedHashMap – Maintains insertion order.
//3️⃣ TreeMap – Stores elements in sorted order (ascending by default).

public class HashMapExample {
	
	  public static void main(String[] args) {
	              
	        // Using HashMap (No Order)
	        Map<Integer, String> hashMap = new HashMap<>();
	        hashMap.put(3, "Banana");
	        hashMap.put(1, "Apple");
	        hashMap.put(2, "Cherry");
	        System.out.println("HashMap: " + hashMap); // Random order

	        // Using LinkedHashMap (Maintains Insertion Order)
	        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
	        linkedHashMap.put(3, "Banana");
	        linkedHashMap.put(1, "Apple");
	        linkedHashMap.put(2, "Cherry");
	        System.out.println("LinkedHashMap: " + linkedHashMap); // Order preserved

	        // Using TreeMap (Sorted Order)
	        Map<Integer, String> treeMap = new TreeMap<>();
	        treeMap.put(3, "Banana");
	        treeMap.put(1, "Apple");
	        treeMap.put(2, "Cherry");
	        System.out.println("TreeMap: " + treeMap); // Sorted by key [1, 2, 3]
	    }

}
