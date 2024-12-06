package NestedClassesPackage;

// Local nested class inside the outerMethod of Outer3 class
class Outer3 {
    void outerMethod() {

        // Local inner class within a method
        class LocalInner {
            void display() {
                System.out.println("Inside Local Inner Class");
            }
        }

        // Creating object of the local inner class and calling its method
        LocalInner local = new LocalInner();
        local.display(); // Output: Inside Local Inner Class
    }
}
