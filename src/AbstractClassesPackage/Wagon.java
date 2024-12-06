package AbstractClassesPackage;

/**
 * Concrete implementation of the AbstractCar class.
 */
public class Wagon extends AbstractCar {
    @Override
    public void drive() {
        System.out.println("Driving the wagon...");
    }
}
