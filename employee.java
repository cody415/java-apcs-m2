// A complete Java program demonstrating class, constructor, and objects
class Student {
    // Attributes (fields)
    String name;
    int age;
    double grade;

    // Constructor to initialize Student objects
    Student(String studentName, int studentAge, double studentGrade) {
        name = studentName;
        age = studentAge;
        grade = studentGrade;
    }

    // Method to display student details
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    // Method to check if student passed
    void checkPass() {
        if (grade >= 50) {
            System.out.println(name + " has passed.");
        } else {
            System.out.println(name + " has failed.");
        }
    }
}

// Main class with entry point
public class employee {
    public static void main(String[] args) {
        // Creating objects using the constructor
        Student s1 = new Student("Kush", 20, 85.5);
        Student s2 = new Student("Aarav", 22, 45.0);

        // Calling methods on objects
        s1.displayInfo();
        s1.checkPass();

        s2.displayInfo();
        s2.checkPass();
    }
}
