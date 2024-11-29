public class Aggregate{
    public static void main(String[] args) {
        // Create an Address object
        Address address = new Address();
        address.setHouse(23);
        address.setStreet("Lane-A");

        // Create a Person object and set the Address
        Person person = new Person();
        person.setName("Kashaf");
        person.setPhoneno(03004563040L);
        person.setAddress(address); // Aggregation: Person has a reference to Address

        // Print the person's name and address
        System.out.println(person.getName());
        System.out.println(person.getAddress().getStreet());
    }
}

class Person {
    private String name;
    private long phoneno;
    private Address address; // Person has a reference to Address (Aggregation)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

class Address {
    private int house;
    private String street;

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
