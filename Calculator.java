// Parent class
class Calculator {
    double num1, num2;

    // Constructor
    Calculator(double a, double b) {
        num1 = a;
        num2 = b;
    }

    // Common method to display numbers
    void displayNumbers() {
        System.out.println("Number 1: " + num1 + ", Number 2: " + num2);
    }
}

// Child class for Addition
class Addition extends Calculator {
    Addition(double a, double b) {
        super(a, b); // call parent constructor
    }

    void add() {
        System.out.println("Addition: " + (num1 + num2));
    }
}

// Child class for Subtraction
class Subtraction extends Calculator {
    Subtraction(double a, double b) {
        super(a, b);
    }

    void subtract() {
        System.out.println("Subtraction: " + (num1 - num2));
    }
}

// Child class for Multiplication
class Multiplication extends Calculator {
    Multiplication(double a, double b) {
        super(a, b);
    }

    void multiply() {
        System.out.println("Multiplication: " + (num1 * num2));
    }
}

// Child class for Division
class Division extends Calculator {
    Division(double a, double b) {
        super(a, b);
    }

    void divide() {
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Error: Division by zero!");
        }
    }
}

// Main class
public class Calculator{
    public static void main(String[] args) {
        // Example usage
        Addition addObj = new Addition(10, 5);
        addObj.displayNumbers();
        addObj.add();

        Subtraction subObj = new Subtraction(10, 5);
        subObj.displayNumbers();
        subObj.subtract();

        Multiplication mulObj = new Multiplication(10, 5);
        mulObj.displayNumbers();
        mulObj.multiply();

        Division divObj = new Division(10, 5);
        divObj.displayNumbers();
        divObj.divide();
    }
}
