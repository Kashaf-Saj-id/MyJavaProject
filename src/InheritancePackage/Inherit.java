package InheritancePackage;

public class Inherit {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", "huge", 200);
        doani(animal, "slow");

        Dog1 dog = new Dog1("Bella", "small", 56);  // Creating a Dog object
        doani(dog, "fast");
    }

    public static void doani(Animal animal, String speed) {
        animal.makeNoise();  // Animal makes noise
        animal.move(speed);  // Animal moves with specified speed
        System.out.println(animal);
    }
}
