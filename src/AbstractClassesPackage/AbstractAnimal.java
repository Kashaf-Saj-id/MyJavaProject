package AbstractClassesPackage;

/**
 * Abstract class representing a generic animal.
 */
public abstract class AbstractAnimal {
    protected String type;
    private String size;
    private double weight;

    public AbstractAnimal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);

    public abstract void makeNoise();
}
