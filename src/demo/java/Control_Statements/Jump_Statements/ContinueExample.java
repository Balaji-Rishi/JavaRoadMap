package demo.java.Control_Statements.Jump_Statements;

public class ContinueExample {
	  public static void main(String[] args) {
	        for (int i = 1; i <= 5; i++) {
	            if (i == 3) {
	                continue; // Skips the iteration when i == 3
	            }
	            System.out.println("Number: " + i);
	        }
	    

}
}
