package demo.java.String.StringMethods;

public class ReplaceExample {
    public static void main(String[] args) {
        String str = "Java is fun";
        System.out.println(str.replace('a', '*')); // Output: J*v* is fun
        System.out.println(str.replace("fun", "awesome")); // Output: Java is awesome
    }
}

