package ExceptionHandling.UnCheckedExceptions;


//This exception occurs when trying to convert a string to a number
// but the string is not a valid number.


public class NumberFormatExceptionExample {
    public static void main(String[] args) {

        String str = "abc";  // Non-numeric string
        try {
            // Attempting to convert a non-numeric string to an integer
            int num = Integer.parseInt(str);
            System.out.println("Converted number: " + num);
        }
        catch (NumberFormatException e) {
            // Catching the exception and printing an error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}
