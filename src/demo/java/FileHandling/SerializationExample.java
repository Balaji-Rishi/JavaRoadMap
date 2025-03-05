package demo.java.FileHandling;

//Serialization is the process of converting an object into a byte stream, 
//and deserialization is reconstructing it back into an object.

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);

        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(person);
            System.out.println("Object serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }
}

