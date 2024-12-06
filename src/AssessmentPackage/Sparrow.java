package AssessmentPackage;

/**
 * Subclass of Wild that overrides the sound method for a Sparrow.
 */
public class Sparrow extends Wild {
    // Overridden method that prints sound made by a Sparrow
    @Override
    public void sound() {
        System.out.println("Sparrow sings");
    }
}
