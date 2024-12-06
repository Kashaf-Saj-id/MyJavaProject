package InheritancePackage;

// Animal class represents a generic animal with type, size, and weight
class Animal {
    private String type;
    private String size;
    private double weight;

    // Default constructor
    public Animal() {
    }

    // Parameterized constructor
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    // toString method to represent Animal details
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    // Method to simulate movement with a given speed
    public void move(String speed) {
        System.out.println(type + " moves with speed " + speed);
    }

    // Method to make noise
    public void makeNoise() {
        System.out.println(type + " makes noises");
    }
}
