package AbstractClassesPackage;

/**
 * Abstract class representing a car with abstract and non-abstract methods.
 */
public abstract class AbstractCar {
    public abstract void drive(); // Abstract method

    public void music() { // Non-abstract method
        System.out.println("Playing music...");
    }
}
