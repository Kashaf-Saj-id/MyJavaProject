package InterfacePackage;

// C class implements interface D and provides implementations for method1 and method2
class C implements D {
    // Overriding method1 from interface D
    @Override
    public void method1() {
        System.out.println("method1");
    }

    // Implementing method2 from interface D
    @Override
    public void method2() {
        System.out.println("method2");
    }
}
