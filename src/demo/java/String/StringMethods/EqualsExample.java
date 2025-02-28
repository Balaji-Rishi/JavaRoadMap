package demo.java.String.StringMethods;

public class EqualsExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2)); // Output: false
        System.out.println(str1.equalsIgnoreCase(str2)); // Output: true
    }
}

