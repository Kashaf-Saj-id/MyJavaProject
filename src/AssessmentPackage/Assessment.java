package AssessmentPackage;

import java.util.Scanner;

/**
 * Main class to demonstrate various Java features including loops, string reversal, and method overloading.
 */
public class Assessment {
    public static void main(String[] args) {

        /*  -----Wrapper classes:---
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
         */

        // Wrapper class examples
        Integer value = 10;
        System.out.println("First value: " + value);

        // Changing value
        value = 20;
        System.out.println("New value: " + value);

        // String manipulation
        String name = "Usman";
        System.out.println("First value: " + name);
        name = "Asma";
        System.out.println("Second value: " + name);

        // Loop examples
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + "    ");
        }
        System.out.println("");

        int i = 0;
        while (i <= 100) {
            System.out.print(i + "   ");
            i++;
        }
        System.out.println("");

        int j = 1;
        do {
            System.out.print(j + "  ");
            j++;
        } while (j <= 100);
        System.out.println("");

        // Reverse input string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String rev = "";
        for (int k = input.length() - 1; k >= 0; k--) {
            rev += input.charAt(k);  // Concatenate each character in reverse order
        }
        System.out.println("Reversed string: " + rev);

        // Method overloading demonstration
        Calcu calc = new Calcu();
        int sum1 = calc.add(1, 2, 3);
        System.out.println(sum1);
        int sum2 = calc.add(1, 2);
        System.out.println(sum2);
        int sum3 = calc.add(1, 2, 6, 1);
        System.out.println(sum3);

        // Method overriding demonstration
        Wild s = new Sparrow();
        s.sound();
    }

    /**
     * Prints the multiplication table of a given number.
     */
    public static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            int a = i * num;
            System.out.println(num + " x " + i + " = " + a);
        }
    }
}
