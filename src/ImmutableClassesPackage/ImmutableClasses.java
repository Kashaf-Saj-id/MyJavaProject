package ImmutableClassesPackage;

public class ImmutableClasses {

    public static void main(String[] args) {

        // Creating an immutable object
        Emplo emp = new Emplo("Alice", 101);

        // Accessing the fields using getter methods
        System.out.println(emp.getName()); // Output: Alice
        System.out.println(emp.getId()); // Output: 101

        // Trying to modify the fields will cause an error as the fields are final
        // emp.name = "Bob"; // Error: Cannot assign value to final field 'name'
        // emp.id = 102;     // Error: Cannot assign value to final field 'id'
    }
}
