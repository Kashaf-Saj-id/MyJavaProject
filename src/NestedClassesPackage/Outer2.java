package NestedClassesPackage;

// Non-static nested class (inner class) inside Outer2 class
class Outer2 {
    class InnerNonStatic {
        void display() {
            System.out.println("Inside Inner of non static");
        }
    }
}
