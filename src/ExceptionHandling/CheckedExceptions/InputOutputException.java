package ExceptionHandling.CheckedExceptions;

import java.io.*;

public class InputOutputException {

    //This exception occurs when there’s an issue with Input/Output operations,
    //like reading from or writing to a file or network connection.
    //For example: Trying to read a file that doesn't exsits

    public static void main(String[] args) {

        try{
           FileReader file = new FileReader("file.txt");
           BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());

        }catch(IOException e){
            System.out.println("Error reading the file message"+ e.getMessage());
        }


        try{
            FileWriter file = new FileWriter("file.txt");
            BufferedWriter filewriter = new BufferedWriter(file);
            filewriter.write("Hello! I am writing through buffer");
            filewriter.newLine();
            filewriter.close();    //Always close the writer after use
            System.out.println("Sucessfully written to the file");
        }catch(IOException e){
            System.out.println("Error in writing the file "+e.getMessage());

        }






    }
}

