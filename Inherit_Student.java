// Parent class
class Person {
    String name;
    int age;

    // Constructor
    Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    // Method to display person details
    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class (inherits from Person)
class Student extends Person {
    int rollNumber;
    double grade;

    // Constructor for Student
    Student(String studentName, int studentAge, int roll, double studentGrade) {
        // Call parent constructor using super
        super(studentName, studentAge);
        rollNumber = roll;
        grade = studentGrade;
    }

    // Method to display student details
    void displayStudentInfo() {
        // Reuse parent method
        displayPersonInfo();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("-------------------------");
    }
}


public class Inherit_Student {
    public static void main(String[] args) {
        // Creating Student objects
        Student s1 = new Student("Kush", 20, 101, 88.5);
        Student s2 = new Student("Aarav", 22, 102, 76.0);

        // Displaying student details
        s1.displayStudentInfo();
        s2.displayStudentInfo();
    }
}
