package CastingPackage;

/**
 * CastB class that extends CastA and adds a new method show2.
 * CastB objects can be referenced by a CastA variable due to inheritance.
 */
class CastB extends CastingPackage.CastA {

    // Method from CastB
    public void show2() {
        System.out.println("Class B show method");
    }
}
