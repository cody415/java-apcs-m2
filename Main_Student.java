// A complete Java program to display student details
class Student {
    // Attributes (fields)
    int rollNumber;
    String name;
    int age;
    double grade;

    // Constructor to initialize Student objects
    Student(int roll, String studentName, int studentAge, double studentGrade) {
        rollNumber = roll;
        name = studentName;
        age = studentAge;
        grade = studentGrade;
    }

    // Method to display student details
    void displayInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("-------------------------");
    }
}

public class Main_Student{
    public static void main(String[] args) {
        // Creating Student objects using the constructor
        Student s1 = new Student(1, "Kush", 20, 88.5);
        Student s2 = new Student(2, "Aarav", 22, 76.0);
        Student s3 = new Student(3, "Meera", 19, 91.2);

        // Displaying student details
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
