package demo.java.String;

// String (Immutable)
//Strings in Java are immutable, meaning their values cannot be changed after creation.
//String operations like concatenation create a new object in memory

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        str1 = str1 + " World"; // Creates a new object
        System.out.println(str1); // Output: Hello World
    }
}

