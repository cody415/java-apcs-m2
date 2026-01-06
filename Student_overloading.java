// Demonstrating Method Overloading with Student details
class Student {
    // Overloaded method: only name
    void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Overloaded method: name + age
    void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Overloaded method: name + age + grade
    void displayInfo(String name, int age, double grade) {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class Student_overloading {
    public static void main(String[] args) {
        Student s = new Student();

        // Calling different overloaded methods
        s.displayInfo("Kush");
        s.displayInfo("Aarav", 22);
        s.displayInfo("Meera", 19, 91.5);
    }
}
