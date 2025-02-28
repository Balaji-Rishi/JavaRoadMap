package demo.java.Control_Statements.Jump_Statements;

public class BreakExample {
	
	  public static void main(String[] args) {
	        for (int i = 1; i <= 5; i++) {
	            if (i == 3) {
	                break; // Exits the loop when i == 3
	            }
	            System.out.println("Number: " + i);
	        }
	    }

}
