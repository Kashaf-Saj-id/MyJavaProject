package ExceptionHandling.CheckedExceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


//This exception occurs when there is an error in parsing data, like when converting
// a string into a date or number.
public class ParseExceptionExample {
    public static void main(String[] args) {

        String today = "12-2001-01";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        formatter.setLenient(false); //used to set  false the leniency of the interpretation of date and time.
        try{
            Date date = formatter.parse(today);
            System.out.println(date);

        }catch(ParseException e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}
