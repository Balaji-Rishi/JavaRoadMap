package demo.java.OOPConcepts;

//📌 What is Inheritance?
//Inheritance allows a child (subclass) to inherit properties 
//and methods from a parent (superclass).


class Animals {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animals {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
	
	 public static void main(String[] args) {
	        Animals myAnimal = new Cat(); // Polymorphism
	        myAnimal.makeSound();  // Calls Cat's method
	    }

}
