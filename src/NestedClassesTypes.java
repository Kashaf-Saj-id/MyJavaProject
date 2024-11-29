public class NestedClassesTypes {
    public static void main(String[] args) {
        Outer.InnerStaticClass s1 = new Outer.InnerStaticClass();  // No instance of outer required
        s1.display();

        Outer2 o = new Outer2();
        Outer2.InnerNonStatic s2 = o.new InnerNonStatic();


        /// Anonymus Inner Class
            Greeting greeting = new Greeting() { // Anonymous Inner Class
                public void sayHello(String alice) {
                    System.out.println("Hello from Anonymous Inner Class");
                }
            };
            greeting.sayHello("Alice"); // Output: Hello from Anonymous Inner Class


        }

}

class Outer{
    static class InnerStaticClass{
        void display(){
            System.out.println("Inside nested static class");
        }
    }
}

class Outer2{
    class InnerNonStatic{
        void display(){
            System.out.println("Inside Inner of non static");
        }
    }
}


//////-------------Local Nested class:
class Outer3  {
    void outerMethod() {

        class LocalInner {
            void display() {
                System.out.println("Inside Local Inner Class");
            }

        }
        LocalInner local = new LocalInner();
        local.display(); // Output: Inside Local Inner Class
    }
}


///------Anonymus Inner Class:
interface Greeting {
    void sayHello(String alice);
}





