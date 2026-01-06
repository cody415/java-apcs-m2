// Base class (Grandparent)
class Animal {
    String species;

    Animal(String speciesName) {
        species = speciesName;
    }

    void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

// Derived class (Parent) inherits from Animal
class Mammal extends Animal {
    String type;

    Mammal(String speciesName, String mammalType) {
        super(speciesName); // call Animal constructor
        type = mammalType;
    }

    void displayType() {
        displaySpecies(); // reuse parent method
        System.out.println("Type: " + type);
    }
}

// Derived class (Child) inherits from Mammal
class Dog extends Mammal {
    String breed;

    Dog(String speciesName, String mammalType, String dogBreed) {
        super(speciesName, mammalType); // call Mammal constructor
        breed = dogBreed;
    }

    void displayDogInfo() {
        displayType(); // reuse Mammal method
        System.out.println("Breed: " + breed);
        System.out.println("-------------------------");
    }
}

// Main class
public class Inherit_Animal {
    public static void main(String[] args) {
        // Creating Dog object (inherits from Mammal → Animal)
        Dog d1 = new Dog("Animal", "Mammal", "German Shepherd");
        Dog d2 = new Dog("Animal", "Mammal", "Golden Retriever");

        // Displaying details
        d1.displayDogInfo();
        d2.displayDogInfo();
    }
}
