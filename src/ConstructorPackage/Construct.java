package ConstructorPackage;

/**
 * Main class demonstrating constructor overloading and constructor chaining.
 * - Creates objects of Minor class using different constructors.
 */
public class Construct {
    public static void main(String[] args) {

        // Using constructor with all parameters
        Minor min = new Minor(12345, "amir", 23.5);
        System.out.println(min.rollno);  // Prints roll number (12345)

        // Using constructor with rollno and name, default marks will be 23.7
        Minor min2 = new Minor();
        System.out.println(min2.name);  // Prints name ("Atif")
    }
}
