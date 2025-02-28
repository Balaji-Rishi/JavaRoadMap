package demo.java.String;

//StringBuffer (Mutable, Thread-Safe)
//Similar to StringBuilder but thread-safe (slightly slower due to synchronization).
//Used in multi-threaded environments.

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // Modifies the existing object
        System.out.println(sb); // Output: Hello World
    }
}

