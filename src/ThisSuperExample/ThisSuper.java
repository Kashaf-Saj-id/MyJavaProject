package ThisSuperExample;

public class ThisSuper {
    public static void main(String[] args) {
        // Creating an object of class B using its parameterized constructor
        B a = new B(4); // This will call B(int n), which in turn calls B() and A(int n)
    }
}

