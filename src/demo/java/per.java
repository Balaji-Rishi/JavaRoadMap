package demo.java;

class Person {
    private String name;  // Private variable

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

public class per{
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Balaji");
        System.out.println("Name: " + p.getName());
    }
}


