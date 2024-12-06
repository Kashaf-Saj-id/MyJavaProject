package ImmutableClassesPackage;

// The class is marked as final to prevent subclassing
final class Emplo {

    // Fields are private and final, meaning they cannot be changed after object creation
    private final String name; // Final field
    private final int id;      // Final field

    // Constructor to initialize the fields
    public Emplo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter methods to access the fields
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // No setter methods provided, making the class truly immutable
}
