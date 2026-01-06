// Parent class
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method Overloading: same name, different parameters
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void displayInfo(String course) {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    void displayInfo(String course, double grade) {
        System.out.println("Name: " + name + ", Age: " + age +
                           ", Course: " + course + ", Grade: " + grade);
    }
}

// Child class
class GraduateStudent extends Student {
    String specialization;

    GraduateStudent(String name, int age, String specialization) {
        super(name, age); // call parent constructor
        this.specialization = specialization;
    }

    // Method Overriding: redefine parent's method
    @Override
    void displayInfo() {
        System.out.println("Graduate Student: " + name + ", Age: " + age +
                           ", Specialization: " + specialization);
    }
}


public class Student_over_ride_load {
    public static void main(String[] args) {
        // Parent class object
        Student s1 = new Student("Kush", 20);
        s1.displayInfo(); // calls parent version
        s1.displayInfo("Computer Science");
        s1.displayInfo("Mathematics", 88.5);

        // Child class object
        GraduateStudent g1 = new GraduateStudent("Aarav", 24, "Artificial Intelligence");
        g1.displayInfo(); // calls overridden version in GraduateStudent
        g1.displayInfo("Data Science", 91.2); // still uses overloaded methods from Student
    }
}
