package CompositionPackage;

/**
 * Class2 represents an address with house number and street name.
 * - It is used as part of Class1 (composition).
 */
class Class2 {
    private int house;
    private String street;

    // Getter and setter for house number
    public int getHouse() {
        return house;
    }
    public void setHouse(int house) {
        this.house = house;
    }

    // Getter and setter for street name
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
}
