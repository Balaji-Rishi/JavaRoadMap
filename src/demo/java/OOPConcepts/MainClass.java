package demo.java.OOPConcepts;

//What is a Class?
//A class is a blueprint for creating objects. It defines properties (variables) and behaviors (methods).

//What is an Object?
//An object is an instance of a class. It has state (data) and behavior (methods).

//Defining a Class
class Car {
 String brand;  // Property (Variable)
 int speed;

 // Method
 void displayInfo() {
     System.out.println("Car Brand: " + brand + ", Speed: " + speed + " km/h");
 }
}

//Main class to create objects
public class MainClass {
	
	 public static void main(String[] args) {
	        Car myCar = new Car();  // Creating an object
	        myCar.brand = "Toyota";
	        myCar.speed = 120;
	        
	        myCar.displayInfo();  // Calling method
	    }

}
