import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
     int currentYear = 2024;
    try {
        System.out.println(getInputConsole(currentYear));
    }
    catch (NullPointerException e) {
        System.out.println(getInputScanner(currentYear));
    }


    }




    public static String getInputConsole(int currentY){

        String name = System.console().readLine("Please type your name? :");
        System.out.println("Hi! your name is  "+ name + ". Nice to meet you!" );

        String DOB = System.console().readLine("Whats your year of birth? :");
        int age = currentY - Integer.parseInt(DOB);

        System.out.println(" Your age according to year is "+ age);
        return "";

    }



    public static String getInputScanner(int currentY){

        Scanner scanner = new Scanner(System.in);    // Instance of scanner

        //String name = System.console().readLine("Please type your name? :");
        System.out.println("Whats your name ? ");
        String name = scanner.nextLine();
        System.out.println("Hi! your name is  "+ name + ". Nice to meet you!" );

        //String DOB = System.console().readLine("Whats your year of birth? :");

        System.out.println("What is your birth year");

        boolean validyear = false;
        int age =0;
        do {
            System.out.println("Enter your birth year >= "+ (currentY - 125) +" and <= " +currentY );
           try{
               age = checkData( currentY, scanner.nextLine());
              validyear = age < 0? false: true;
           }catch( NumberFormatException badUserData){
             System.out.println("Characters not allowed !!!!!!!!");
            }

        } while(!validyear);

        return (" Your age according to year is "+ age);
    }




 public  static int  checkData(int currentY, String by){
        int birthYear =  Integer.parseInt(by);
        int minYear  = currentY - 125;
        if((birthYear < minYear) ||  (birthYear > currentY) ){
            return -1;
        }

        return (currentY - birthYear);

 }

}

