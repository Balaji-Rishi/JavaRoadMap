package demo.java.String;

// StringBuilder (Mutable, Not Thread-Safe)
//Faster than String because it does not create new objects.
//It is not thread-safe, meaning multiple threads cannot access it safely.

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Modifies the existing object
        System.out.println(sb); // Output: Hello World
    }
}

