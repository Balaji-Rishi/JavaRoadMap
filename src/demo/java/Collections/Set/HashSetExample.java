package demo.java.Collections.Set;

import java.util.HashSet;
import java.util.*;
//Implements: HashSet, LinkedHashSet, TreeSet
//Allows: No duplicates
//Insertion Order:
//HashSet → No order
//LinkedHashSet → Maintains insertion order
//TreeSet → Sorted order


//1️⃣ HashSet – Unordered, fast access
//2️⃣ LinkedHashSet – Ordered (insertion order)
//3️⃣ TreeSet – Sorted order (ascending by default)

public class HashSetExample {
	
    public static void main(String[] args) {
    	 // Using HashSet (No Order)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Cherry");
        System.out.println("HashSet: " + hashSet); // Random order

        // Using LinkedHashSet (Maintains Insertion Order)
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Cherry");
        System.out.println("LinkedHashSet: " + linkedHashSet); // [Banana, Apple, Cherry]

        // Using TreeSet (Sorted Order)
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        System.out.println("TreeSet: " + treeSet); // [Apple, Banana, Cherry]
    }

}
