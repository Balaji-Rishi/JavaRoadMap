package demo.java.OOPConcepts;

//📌 What is Inheritance?
//Inheritance allows a child (subclass) to inherit properties and 
//methods from a parent (superclass).

//Parent class
class Animal {
 void sound() {
     System.out.println("Animals make sounds");
 }
}

//Child class inheriting from Animal
class Dog extends Animal {
 void bark() {
     System.out.println("Dog barks");
 }
}

public class Inheritance {
	
	  public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.sound();  // Inherited method
	        dog.bark();   // Child class method
	    }

}
