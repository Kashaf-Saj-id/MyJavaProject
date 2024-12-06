package CompositionPackage;

/**
 * Class1 represents a person with a name, phone number, and an address.
 * - Has a reference to Class2 (address) for composition.
 */
class Class1 {
    private String name;
    private long phoneno;
    private Class2 adress;  // Class1 has an address (Class2)

    // Constructor initializing the address object
    public Class1() {
        adress = new Class2();
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for phone number
    public long getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    // Getter and setter for address
    public Class2 getAdress() {
        return adress;
    }
    public void setAdress(Class2 adress) {
        this.adress = adress;
    }
}
