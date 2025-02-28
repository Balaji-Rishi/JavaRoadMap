package demo.java.OOPConcepts;

//📌 What is Encapsulation?
//Encapsulation hides the details of a class and allows access 
//only through getter and setter methods.

class BankAccount {
    private double balance; // Private variable

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Setter method
    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid amount");
        }
    }
}



public class Encapsulation {
	
	  public static void main(String[] args) {
	        BankAccount account = new BankAccount();
	        account.setBalance(1000);  // Setting balance
	        System.out.println("Account Balance: " + account.getBalance());
	    }

}
