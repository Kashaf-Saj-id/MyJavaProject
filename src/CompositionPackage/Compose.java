package CompositionPackage;

/**
 * Main class demonstrating composition.
 * - Class1 has a reference to Class2 (address).
 * - We set the name, phone number, and address of Class1.
 */
public class Compose {
    public static void main(String[] args) {

        // Creating an object of Class1 (Person) and setting its details
        Class1 a = new Class1();
        String name = "Kashaf";
        a.setName(name);  // Setting the name

        long phoneno = 03004563040L;
        a.setPhoneno(phoneno);  // Setting the phone number

        // Creating address and setting its details through Class1 object
        int house = 23;
        a.getAdress().setHouse(house);  // Setting house number in Class2

        String street = "Lane-A";
        a.getAdress().setStreet(street);  // Setting street name in Class2

        // Retrieving the name and address from Class1 and printing it
        String name1 = a.getName();
        System.out.println(name1);  // Prints the name of the person
        System.out.println(a.getAdress().getStreet());  // Prints the street address
    }
}
