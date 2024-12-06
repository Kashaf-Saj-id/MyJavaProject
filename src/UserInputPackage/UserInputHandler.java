package UserInputPackage;
import java.util.Scanner;

public class UserInputHandler {

    public static void main(String[] args) {
        int currentYear = 2024; // Current year to calculate age
        try {
            // Attempting to get user input using console (if available)
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            // If console is unavailable (for example in IDE), fallback to Scanner input
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    /**
     * This method handles user input through the system console.
     * It asks for the user's name and birth year, then calculates their age.
     *
     * @param currentYear the current year to calculate the age
     * @return an empty string (you can customize it to return more if needed)
     */
    public static String getInputFromConsole(int currentYear) {
        // Reading user's name using console
        String name = System.console().readLine("Please type your name: ");
        System.out.println("Hi! Your name is " + name + ". Nice to meet you!");

        // Reading user's year of birth using console
        String dob = System.console().readLine("What's your year of birth? ");
        int age = currentYear - Integer.parseInt(dob);

        // Printing out the calculated age
        System.out.println("Your age according to the year " + currentYear + " is: " + age);
        return ""; // Return an empty string (could be used for other purposes)
    }

    /**
     * This method handles user input through a Scanner (fallback method).
     * It asks for the user's name and birth year, then calculates their age.
     *
     * @param currentYear the current year to calculate the age
     * @return a message with the calculated age
     */
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in); // Instance of scanner for reading input

        // Asking the user for their name
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi! Your name is " + name + ". Nice to meet you!");

        // Asking for the user's year of birth
        System.out.println("What is your birth year?");

        boolean validYear = false;
        int age = 0;

        // Looping until the user enters a valid year of birth
        do {
            System.out.println("Enter your birth year >= " + (currentYear - 125) + " and <= " + currentYear);
            try {
                // Calling checkData to validate and calculate the age
                age = checkData(currentYear, scanner.nextLine());
                validYear = age < 0 ? false : true; // If age is negative, it's invalid
            } catch (NumberFormatException badUserData) {
                // Handling case where the input is not a valid number
                System.out.println("Characters not allowed. Please enter a valid number.");
            }
        } while (!validYear);

        // Returning the calculated age
        return "Your age according to the year " + currentYear + " is: " + age;
    }

    /**
     * This method checks the user's input for valid birth year.
     * It ensures that the year entered is within a reasonable range.
     *
     * @param currentYear the current year to calculate the age
     * @param birthYearStr the birth year entered by the user
     * @return the calculated age or -1 if the year is invalid
     */
    public static int checkData(int currentYear, String birthYearStr) {
        int birthYear = Integer.parseInt(birthYearStr); // Convert input to integer
        int minYear = currentYear - 125; // Minimum valid year (assumes a max age of 125)

        // If the birth year is not in a valid range, return -1 to indicate invalid input
        if (birthYear < minYear || birthYear > currentYear) {
            return -1;
        }

        // If the birth year is valid, return the calculated age
        return (currentYear - birthYear);
    }
}
