package AggregationPackage;

/**
 * Represents an address with attributes like house number and street name.
 * Used as an aggregated part of the Person class.
 */
public class Address {
    private int house; // House number
    private String street; // Street name

    // Getter for house number
    public int getHouse() {
        return house;
    }

    // Setter for house number
    public void setHouse(int house) {
        this.house = house;
    }

    // Getter for street name
    public String getStreet() {
        return street;
    }

    // Setter for street name
    public void setStreet(String street) {
        this.street = street;
    }
}
