package ExceptionHandling.CheckedExceptions;

// This exception occurs when the Java runtime
// cannot find a class that you're trying to load.
public class ClassNotFoundExample {
    public static void main(String[] args) {

        try{
            Class.forName("Basics.java");

        }catch(ClassNotFoundException e){
            System.out.println("Error is finding the file " +e.getMessage());
        }
    }
}
