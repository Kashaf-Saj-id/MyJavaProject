public class ImmutableClasses {

    public static void main(String[] args) {


        Emplo emp = new Emplo("Alice", 101);

        // Accessing fields
        System.out.println(emp.getName()); // Output: Alice
        System.out.println(emp.getId());
        // emp.name = "Bob"; ---Error: Cannot assign value to final field

    }
}




final class Emplo{
    private final String name;  // Final field
    private final int id;       // Final field

    // Constructor to initialize fields
    public Emplo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter methods to access fields
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // No setter methods provided
}