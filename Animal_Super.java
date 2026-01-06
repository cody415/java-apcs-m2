// Parent class
class Animal {
    String type = "Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    String type = "Dog";

    Dog() {
        // Call parent constructor
        super();
        System.out.println("Dog constructor called");
    }

    void sound() {
        // Call parent method
        super.sound();
        System.out.println("Dog barks");
    }

    void displayType() {
        // Access parent variable
        System.out.println("Parent type: " + super.type);
        System.out.println("Child type: " + type);
    }
}

// Main class
public class Animal_Super {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.displayType();
    }
}
