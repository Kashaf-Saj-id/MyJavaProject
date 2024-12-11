package ExceptionHandling.UnCheckedExceptions;
import java.util.Scanner;

//This exception occurs when you pass an illegal or
// inappropriate argument to a method.


public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        System.out.println("Number: "+number);

        if(number < 0){    //throw keyword is used when you want to manually throw an exception from your code.
            throw new IllegalArgumentException("Number cannot be negative");

        }

        System.out.println("Number: "+number); //will not execute

    }
}
