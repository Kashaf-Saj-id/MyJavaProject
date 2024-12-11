package ExceptionHandling.CheckedExceptions;

import java.net.MalformedURLException;
import java.net.*;

//This exception occurs when a URL is not formed correctly.
public class MalformedURLExceptionExample {
    public static void main(String[] args) {

        try{
            URL usr = new URL("htp://example.com");

        }catch(MalformedURLException e){
            System.out.println("Invalid URL format: "+e.getMessage());

        }
    }
}
