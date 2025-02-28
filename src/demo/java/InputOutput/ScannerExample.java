package demo.java.InputOutput;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object
        
        // Taking integer input
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        // Taking double input
        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble();
        
        // Taking string input (word)
        System.out.print("Enter a word: ");
        String word = scanner.next();
        
        // Taking full sentence input
        scanner.nextLine();  // Consume the leftover newline character
        System.out.print("Enter a full sentence: ");
        String sentence = scanner.nextLine();

        // Displaying the input values
        System.out.println("Integer: " + num);
        System.out.println("Decimal: " + decimal);
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);

        scanner.close();  // Close the scanner
    }
}

