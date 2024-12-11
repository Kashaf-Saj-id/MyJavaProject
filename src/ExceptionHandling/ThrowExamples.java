package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowExamples {
    public static void main(String[] args) {

        /** ----------THROW--------------
        Throws warns the caller that a method might cause a problem (throw an exception).
        Caller handles it using try catch
        It is required for checked exceptions
        You want to tell the caller to handle the problem instead of handling it yourself.
         */


        try{
            int result= method1( 10, 0);
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: "+e.getMessage());
        }

        try{
            readfiler();
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }

        /*
        -----------Questions related to THROW-------
        Can I use throw for multiple exception?
        Yes, Like : public void method() throws IOException, SQLException

        Is throw mandatory for unchecked Exceptions?
        NO

        Can I use throw with Unchecked Exceptions?
        Yes! But its optional

        Difference in Thorw and throws ?
        throw: Used to throw an exception in the code.
        Example: throw new IOException("Error occurred!");
        throws: Used to declare that a method might throw an exception.
        Example: public void method() throws IOException {}

         */









    }


    // Declaring the exception with 'throws'
    public static int method1 (int a, int b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
            int result = a/b;
            return result;

    }


    // Declaring the exception with 'throws'
    public static void readfiler() throws IOException
    {
        FileReader file = new FileReader("hello.txt");
        file.read();

    }

}
