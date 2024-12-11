package ExceptionHandling.CheckedExceptions;

import java.lang.reflect.Method;


//This exception is thrown when an attempt is made to
//access a method that doesn't exist.


public class NoSuchMethodExceptionExample {
    public static void main(String[] args) {

        try {
            Method m1 = String.class.getMethod("calculateResult");
        }
            catch(NoSuchMethodException e){
                System.out.println("Error in getting method:  "+ e.getMessage());
            }
        }


    }

