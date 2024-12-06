package InheritanceCalculatorPackage;

/**
 * Main class to test the inheritance and perform various calculations using
 * the Basic, Advnace, and Advance2x classes.
 */
public class Calculator {
    public static void main(String[] args) {
        // Create an instance of Advance2x to perform calculations
        Advance2x b = new Advance2x();

        // Perform basic and advanced arithmetic operations
        double r1 = b.add(1, 2);      // Addition
        double r2 = b.subtract(3, 2); // Subtraction
        double r3 = b.multi(2, 3);    // Multiplication
        double r4 = b.div(6, 2);      // Division
        double r5 = b.power(4, 2);    // Power calculation

        // Display the results of calculations
        System.out.println(r1);  // Output: 3
        System.out.println(r2);  // Output: 1
        System.out.println(r3);  // Output: 6
        System.out.println(r4);  // Output: 3.0
        System.out.println(r5);  // Output: 16.0
    }
}
