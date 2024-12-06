package CastingPackage;

/**
 * Main class demonstrating upcasting and downcasting.
 * - Upcasting allows subclass object to be referenced by parent class.
 * - Downcasting allows parent class reference to access subclass-specific methods.
 */
public class Casting {
    public static void main(String[] args) {

        // Upcasting: 'a' has a reference of CastA but points to an object of CastB.
        CastingPackage.CastA a = new CastingPackage.CastB();
        a.show1();  // Can only call methods from CastA

        // Downcasting: casting 'a' back to CastB to access methods from CastB
        CastingPackage.CastB a1 = (CastingPackage.CastB) a;
        a1.show1();  // Can access CastA's methods
        a1.show2();  // Can access CastB's specific methods
    }
}
