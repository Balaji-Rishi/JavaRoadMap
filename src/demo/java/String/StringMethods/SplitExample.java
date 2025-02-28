package demo.java.String.StringMethods;

public class SplitExample {
    public static void main(String[] args) {
        String str = "apple,banana,grape";
        String[] fruits = str.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

