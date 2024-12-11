package ExceptionHandling.CheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//A subclass of IOException, this exception occurs
// when a file cannot be found during an I/O operation.

public class FileNotFoundExample {

    public static void main(String[] args) {

        try{
            FileInputStream file = new FileInputStream("Missing.java");
        }
        catch(FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
