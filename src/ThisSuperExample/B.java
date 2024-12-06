package ThisSuperExample;

public class B extends A {
    // Default constructor of class B
    public B() {
        super(); // Calls the constructor of class A
        System.out.println("This is B constructor");
    }

    // Parameterized constructor of class B
    public B(int n) {
        this(); // Calls the default constructor of class B
        System.out.println("In B's parameterized constructor");
    }
}
