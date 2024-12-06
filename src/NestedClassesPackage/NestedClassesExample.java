package NestedClassesPackage;

public class NestedClassesExample {
    public static void main(String[] args) {
        // Creating an object of static nested class
        Outer.InnerStaticClass s1 = new Outer.InnerStaticClass();
        s1.display();  // Output: Inside nested static class

        // Creating an object of non-static nested class
        Outer2 o = new Outer2();
        Outer2.InnerNonStatic s2 = o.new InnerNonStatic();
        s2.display();  // Output: Inside Inner of non static

        // Using an anonymous inner class
        Greeting greeting = new Greeting() { // Anonymous Inner Class
            public void sayHello(String alice) {
                System.out.println("Hello from Anonymous Inner Class");
            }
        };
        greeting.sayHello("Alice"); // Output: Hello from Anonymous Inner Class
    }
}
