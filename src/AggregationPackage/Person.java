package AggregationPackage;

/**
 * Represents a person with attributes like name, phone number, and address.
 * Demonstrates aggregation by containing a reference to the Address class.
 */
public class Person {
    private String name; // Name of the person
    private long phoneno; // Phone number of the person
    private Address address; // Aggregated reference to an Address object

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for phone number
    public long getPhoneno() {
        return phoneno;
    }

    // Setter for phone number
    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    // Getter for address
    public Address getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(Address address) {
        this.address = address;
    }
}
