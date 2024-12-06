package AggregationPackage;

/**
 * Main class to demonstrate the concept of aggregation in Java.
 * Aggregation: A weak "Has-A" relationship where one class contains a reference to another.
 */
public class AggregateMain {
    public static void main(String[] args) {
        // Create an Address object and set its attributes
        Address address = new Address();
        address.setHouse(23); // Setting house number
        address.setStreet("Lane-A"); // Setting street name

        // Create a Person object and set its attributes
        Person person = new Person();
        person.setName("Kashaf"); // Setting name
        person.setPhoneno(03004563040L); // Setting phone number
        person.setAddress(address); // Setting address (Aggregation)

        // Print the person's name and address details
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person's Street: " + person.getAddress().getStreet());
    }
}
