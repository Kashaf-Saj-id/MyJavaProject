package InterfacePackage;

// D interface defines two methods that any implementing class must override
interface D {
    int age = 23;  // Constant variable (implicitly public, static, and final)
    String area = "2x4";  // Constant variable (implicitly public, static, and final)

    // Abstract methods to be implemented by the class that implements this interface
    void method1();
    void method2();
}
