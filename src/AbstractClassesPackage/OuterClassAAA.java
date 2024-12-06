package AbstractClassesPackage;

/**
 * Class demonstrating inner classes.
 */
public class OuterClassAAA {
    public void printOuterMessage() {
        System.out.println("Message from the outer class OuterClassAAA.");
    }

    /**
     * Non-static inner class.
     */
    public class InnerClassBBB {
        public void printInnerMessage() {
            System.out.println("Message from the inner class InnerClassBBB.");
        }
    }
}
