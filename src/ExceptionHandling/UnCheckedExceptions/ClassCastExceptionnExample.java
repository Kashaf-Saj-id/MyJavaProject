package ExceptionHandling.UnCheckedExceptions;

//It happens when: Casting an object of one type to an incompatible type.
public class ClassCastExceptionnExample {
    public static void main(String[] args) {

        Object obj = "Java";
        try {
            Integer num = (Integer) obj; // Throws ClassCastException
        }
        catch(ClassCastException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

}
