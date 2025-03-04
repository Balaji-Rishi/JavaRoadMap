package demo.java.ExceptionHandling;

//throw (Manually Throwing an Exception)
//throw is used to explicitly throw an exception.

public class ThrowExample {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        checkAge(16);
    }
}


