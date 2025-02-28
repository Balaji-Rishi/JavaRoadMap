package demo.java.Arrays;

//An array in Java is a collection of elements of the same data type, 
//stored in contiguous memory locations.
//It allows storing multiple values under a single variable name.

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // Array of size 5
        numbers[0] = 10; // Assigning values
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("First element: " + numbers[0]); // Output: 10
    }
}

