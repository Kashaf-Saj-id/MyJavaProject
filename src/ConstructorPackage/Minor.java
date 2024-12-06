package ConstructorPackage;

/**
 * Minor class with multiple constructors to demonstrate constructor overloading.
 * - Initializes rollno, name, and marks using different constructors.
 */
class Minor {
    int rollno;
    String name;
    double marks;

    // Constructor with all parameters to initialize rollno, name, and marks
    public Minor(int rollno, String name, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    // Constructor with rollno and name, default marks set to 23.7
    public Minor(int rollno, String name) {
        this(rollno, name, 23.7);  // Calls the constructor with all parameters
    }

    // Default constructor with default values for rollno and name
    public Minor() {
        this(12, "Atif");  // Calls the constructor with rollno and name
    }
}
