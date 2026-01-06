// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another child class
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Animal_override {
    public static void main(String[] args) {
        // Parent reference but child objects
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // Calls overridden methods based on object type
        a1.sound(); // Output: Dog barks
        a2.sound(); // Output: Cat meows
    }
}
