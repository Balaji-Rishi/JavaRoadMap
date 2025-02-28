package demo.java.String.StringMethods;

public class StartsEndsExample {
    public static void main(String[] args) {
        String str = "Spring Boot Framework";
        System.out.println(str.startsWith("Spring")); // Output: true
        System.out.println(str.endsWith("Framework")); // Output: true
        System.out.println(str.startsWith("Boot")); // Output: false
    }
}

