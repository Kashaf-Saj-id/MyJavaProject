package AbstractClassesPackage;

/**
 * Concrete implementation of the AbstractAnimal class.
 */
public class Dog extends AbstractAnimal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(type + " is moving at " + speed + " speed.");
    }

    @Override
    public void makeNoise() {
        if ("wolf".equalsIgnoreCase(type)) {
            System.out.println("Howling...");
        } else {
            System.out.println("Woof!");
        }
    }
}
