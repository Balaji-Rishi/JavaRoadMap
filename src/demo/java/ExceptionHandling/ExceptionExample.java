package demo.java.ExceptionHandling;

//Exception handling is a mechanism that allows a program 
//to handle runtime errors and continue execution smoothly.

//try, catch, finally
//try → Block where an exception might occur.
//catch → Handles the exception.
//finally → Executes whether an exception occurs or not.

public class ExceptionExample {

	 public static void main(String[] args) {
	        try {
	            int result = 10 / 0;  // This will throw an exception
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero.");
	        } finally {
	            System.out.println("Finally block executed.");
//	            System.out.println(result);
	        }
	    }

}
