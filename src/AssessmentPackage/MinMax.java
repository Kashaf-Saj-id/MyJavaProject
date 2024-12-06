package AssessmentPackage;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        findMinMax();
    }

    /**
     * This method prompts the user to input numbers and finds the minimum and maximum values entered.
     */
    public static void findMinMax() {
        Scanner scanner = new Scanner(System.in);

        // Initialize min and max to extreme values
        int min = Integer.MAX_VALUE;  // Start with the highest possible value
        int max = Integer.MIN_VALUE;  // Start with the lowest possible value

        // Loop counter
        int loopC = 0;

        while (true) {
            System.out.print("Enter a number to find max or min OR any character to quit: ");
            String input = scanner.nextLine();

            try {
                // Try to convert the input to an integer
                int number = Integer.parseInt(input);

                // First time entering a number, set min and max
                if (loopC == 0) {
                    min = max = number; // Set both min and max to the first input
                } else {
                    // Update min and max accordingly
                    if (number < min) {
                        min = number;
                    } else if (number > max) {
                        max = number;
                    }
                }

                loopC++; // Increase the loop counter after valid input

            } catch (NumberFormatException nfe) {
                // If the input is not a valid integer, exit the loop
                System.out.println("Invalid input. Exiting...");
                break;
            }
        }

        // Output the final min and max values
        System.out.println("The max value entered: " + max);
        System.out.println("The min value entered: " + min);
    }
}
