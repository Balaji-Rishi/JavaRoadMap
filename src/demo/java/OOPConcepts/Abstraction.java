package demo.java.OOPConcepts;

//📌 What is Abstraction?
//Abstraction hides implementation 
//details and only exposes necessary functionalities.


abstract class Vehicle {
    abstract void start();  // Abstract method (No implementation)
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a key");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle myBike = new Bike();
        myBike.start();
    }
}
