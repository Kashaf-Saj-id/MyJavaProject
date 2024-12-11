package ExceptionHandling.UnCheckedExceptions;


// This exception occurs when you try to create an array with a negative size.
public class NegativeArraySizeExceptionExample {

    public static void main(String[] args) {
        int size = -10;
        int[] arr = new int[size];
    }
}
