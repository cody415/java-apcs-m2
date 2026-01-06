// A complete Java program demonstrating static variables
class StaticCounter {
    // Static variable shared by all objects
    static int count = 0;

    // Constructor increments the static counter
    StaticCounter() {
        count++;
        System.out.println("Object created. Current count: " + count);
    }
}

public class staticCounter {
    public static void main(String[] args) {
        // Creating multiple objects
        StaticCounter c1 = new StaticCounter();
        StaticCounter c2 = new StaticCounter();
        StaticCounter c3 = new StaticCounter();

        // Accessing static variable directly using class name
        System.out.println("Total objects created: " + StaticCounter.count);
    }
}
