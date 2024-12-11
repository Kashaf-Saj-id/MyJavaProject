package ExceptionHandling;

import java.util.Scanner;

public class TryCatchFinallyExamples {
    public static void main(String[] args) {
        /*
        -------------TRY CATCH-----------------
        TRY BLOCK: Contains code that might throw an error
        CATCH BLOCK: Conatins the code to handle the exception
*/
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the Numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Please enter a positive denominator: ");
            int denominator = scanner.nextInt();

            System.out.println("Equation you want result of: " + numerator + "/" + denominator);

         int result = 0;
            try {
               result = numerator / denominator;
            } catch (ArithmeticException e) {
                System.out.println("WRONGGGGGGG!!!!! Error : " + e.getMessage());
            }

            //-------------FINALLY------------------
            //This block will always execute weather an exception occurs or not
            finally {
                System.out.println("Result: "+result);
                System.out.println("This Block willl always execute");
            }


            /*
           Questions Realted to try - catch :
           A try block can have how many catch blocks?
           many

           Can we have try block without catch ?
           Yes but there must be a final block then

           Can a Catch block can castch multipe exceptions ?
           Yes! like : catch (ArithmeticException | NullPointerException e)

           If you want to make nested Try Catch then where do you do?
           Inside Try Block.

           Is final block mandatory?
           No! its optional but good for cleanup code

           What happens if an exception is not caught?
           The program will stop, and Java will display an error message (stack trace).

           Does The final block always run?
           Yes ! for sure. excepts when program exits(System.exist()) or any fatal errors

             */


    }

}
