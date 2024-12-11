package ExceptionHandling.UnCheckedExceptions;

//This exception is thrown when a method is invoked at an inappropriate
//time or the state of an object is invalid for the operation.

import java.util.Arrays;
import java.util.Iterator;

//This exception is thrown when a method is invoked at an inappropriate
// time or the state of an object is invalid for the operation.
public class IllegalStateExceptionExample {
    public static void main(String[] args) {
        Iterator<Integer> iterator = Arrays.asList(1, 2, 3).iterator();
        iterator.remove();   //throws exception because no element is selected to remove

    }
}
