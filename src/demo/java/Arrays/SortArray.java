package demo.java.Arrays;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {40, 10, 30, 20, 50};

        Arrays.sort(numbers); // Sort the array in ascending order

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}

