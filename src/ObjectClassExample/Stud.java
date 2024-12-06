package ObjectClassExample;

// The Stud class represents a student with a name and age
class Stud {
    private String name;
    private int age;

    // Constructor to initialize name and age
    Stud(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the toString() method to return a custom string representation of Stud
    @Override
    public String toString() {
        return name + " is " + age; // Simple format for output
    }
}
