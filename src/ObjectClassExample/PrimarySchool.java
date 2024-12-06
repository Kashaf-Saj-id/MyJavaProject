package ObjectClassExample;

// PrimarySchool class inherits from Stud class and adds parentName
class PrimarySchool extends Stud {
    private String parentName;

    // Constructor to initialize name, age and parentName
    public PrimarySchool(String name, int age, String parentName) {
        super(name, age);  // Calling the superclass (Stud) constructor
        this.parentName = parentName;
    }

    // Overriding the toString() method to include parentName
    @Override
    public String toString() {
        return super.toString() + " has parent " + parentName;  // Appends parentName to the Stud's toString()
    }
}
