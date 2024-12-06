package AbstractClassesPackage;

/**
 * Main class to demonstrate abstract classes, inner classes, and anonymous classes.
 */
public class AbstractClassMain {
    public static void main(String[] args) {
        // Demonstrating Abstract Class with Car1 and Wagon
        AbstractCar car = new Wagon();
        car.drive();
        car.music();

        // Demonstrating Non-static Inner Class
        OuterClassAAA outerObj = new OuterClassAAA();
        outerObj.printOuterMessage();
        OuterClassAAA.InnerClassBBB innerObj = outerObj.new InnerClassBBB();
        innerObj.printInnerMessage();

        // Demonstrating Abstract Class with Animal and Dog
        AbstractAnimal dog = new Dog("wolf", "Big", 1000);
        dog.makeNoise();

        // Demonstrating Anonymous Inner Classes
        AbstractDisplay display1 = new AbstractDisplay() {
            @Override
            public void show() {
                System.out.println("Anonymous class implementation in main.");
            }
        };
        display1.show();

        ConcreteDisplay concreteDisplay = new ConcreteDisplay();
        concreteDisplay.show();

        AbstractDisplay display2 = new AbstractDisplay() {
            @Override
            public void show() {
                System.out.println("Another anonymous class from AbstractDisplay.");
            }
        };
        display2.show();
    }
}
