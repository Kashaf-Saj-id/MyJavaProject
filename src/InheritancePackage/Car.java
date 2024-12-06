package InheritancePackage;

// Car class represents a vehicle with model, color, and availability status
class Car {
    private String carModel = "Suzuki";
    private String color = "Grey";
    private boolean available = true;

    // Default constructor
    public Car() {
        System.out.println("This is the default constructor");
    }

    // Method to display car details
    public void displayCar() {
        System.out.println("Car with model " + carModel + " is " + (available ? "available" : "not available") +
                " in " + color + " color.");
    }

    // Getter and setter methods for carModel
    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    // Getter methods for other fields
    public String getColor() {
        return color;
    }

    public boolean isAvailable() {
        return available;
    }
}
