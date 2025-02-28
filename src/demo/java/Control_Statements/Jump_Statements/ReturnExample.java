package demo.java.Control_Statements.Jump_Statements;

public class ReturnExample {
	
	  public static void main(String[] args) {
	        System.out.println("Start");
	        printMessage();
	        System.out.println("End");
	    }

	    static void printMessage() {
	        System.out.println("Inside method");
	        return; // Exits the method
	    }

}
