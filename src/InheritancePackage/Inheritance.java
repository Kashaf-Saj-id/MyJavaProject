package InheritancePackage;

public class Inheritance {
    public static void main(String[] args) {
        Car car1 = new Car();  // Creating a Car object

        System.out.println(car1.getCarModel());  // Get and print the car model

        car1.setCarModel("Honda");  // Set a new car model
        System.out.println(car1.getCarModel());  // Print updated car model

        car1.displayCar();  // Display car details
    }
}
