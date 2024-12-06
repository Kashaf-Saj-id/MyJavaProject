package InheritancePackage;

// Dog class extends Animal and adds specific behaviors
class Dog1 extends Animal {
    private String earShape;
    private String tail;

    // Constructor that calls Animal constructor
    public Dog1(String type, String size, double weight) {
        super(type, size, weight);
    }

    // Constructor with additional attributes for Dog
    public Dog1(String type, String size, double weight, String tail, String earShape) {
        super(type, size, weight);
        this.tail = tail;
        this.earShape = earShape;
    }

    // Overridden toString method to include Dog-specific details
    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tail='" + tail + '\'' +
                "} " + super.toString();
    }

    // Overridden method to move the Dog with specific actions
    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed.equals("slow")) {
            walk();
            tail();
        } else {
            bark();
        }
        System.out.println();
    }

    // Dog-specific actions
    private void bark() {
        System.out.println("Woof!");
    }

    private void walk() {
        System.out.println("Dog Walk!");
    }

    private void tail() {
        System.out.println("Tail wagging!");
    }
}
