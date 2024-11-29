public class inherit {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", "huge", 200);
        doani(animal, "slow");

        Dog dog = new Dog("Bella", "small", 56);  // Creating a Dog object with appropriate constructor
        doani(dog, "fast");
    }

    public static void doani(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
    }
}

class Animal {
    private String type;
    private String size;
    private double weight;

    public Animal() {       //empty constructor
    }

    public Animal(String type, String size, double weight) {     //permetereized
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {      //Method to print the fields out
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + " moves with speed " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes noises");
    }
}





class Dog extends Animal {
    private String earshap;
    private String tail;
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    public Dog(String type, String size, double weight, String tail, String earshap) {
        super(type, size, weight);
        this.tail = tail;
        this.earshap = earshap;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earshap='" + earshap + '\'' +
                ", tail='" + tail + '\'' +
                "} " + super.toString();
    }


    @Override
    public void makeNoise() {

    }

    @Override                         // overiden from parent
    public void move(String speed) {
        super.move(speed);
        if (speed=="slow"){
            walk();
            tail();
        }
        else {
            bark();
        }
        System.out.println();
    }


    private void bark(){
        System.out.println("Woof!");
    }
    private void walk(){
        System.out.println("Dog Walk!");
    }
    private void tail(){
        System.out.println("Tail wagging!");
    }



}
