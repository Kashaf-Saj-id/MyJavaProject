package ThisSuperExample;

public class A {
    // Default constructor of class A
    public A() {
        super(); // Calls the constructor of the parent class (Object)
        System.out.println("This is A");
    }

    // Parameterized constructor of class A
    public A(int n) {
        super(); // Calls the constructor of the parent class (Object)
        System.out.println("This is A's parameterized constructor");
    }
}
