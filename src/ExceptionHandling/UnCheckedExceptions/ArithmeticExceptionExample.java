package ExceptionHandling.UnCheckedExceptions;

// This exception occurs when
// there’s an error in an arithmetic operation.
public class ArithmeticExceptionExample {
    public static void main(String[] args) {

        try{
            int result = 10/0;

        } catch (ArithmeticException e ){
            System.out.println("Error in Arithmetic Operation: "+e.getMessage());
        }
    }
}
