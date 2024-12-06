package RegexPackage;

import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
        // Original text and pattern
        String text = "I have 2 apples and 3 oranges, 23 bananas, and 456 grapes.";
        String pattern = "\\d"; // Pattern to find any single digit (0-9)

        // Compile the pattern
        Pattern regex = Pattern.compile(pattern);  // Compile the pattern
        Matcher matcher = regex.matcher(text);      // Create a matcher object for the input text

        // Find and print individual digits (Original logic)
        System.out.println("Matching single digits:");
        while (matcher.find()) {      // Loop through each match
            System.out.println("Found: " + matcher.group());  // Print each matched digit
        }

        // Now, match complete numbers (multiple digits together)
        System.out.println("\nMatching complete numbers:");
        pattern = "\\d+";  // Pattern to match one or more digits in sequence
        regex = Pattern.compile(pattern); // Update compiled regex with new pattern
        matcher = regex.matcher(text);  // Recreate matcher object with new pattern

        // Find and print whole numbers (multiple digits together)
        while (matcher.find()) {  // Loop through each match (whole numbers)
            System.out.println("Found: " + matcher.group());  // Print each matched number
        }

        // Match a pattern for a word that contains letters and digits
        System.out.println("\nMatching alphanumeric words:");
        pattern = "\\w+";  // Pattern to match words (alphanumeric characters)
        regex = Pattern.compile(pattern); // Update compiled regex with new pattern
        matcher = regex.matcher(text);  // Recreate matcher object with new pattern

        // Find and print alphanumeric words (words containing both letters and digits)
        while (matcher.find()) {  // Loop through all matches of alphanumeric words
            System.out.println("Found: " + matcher.group());  // Print matched alphanumeric word
        }

        // Match any occurrence of the word 'apples' in the text
        System.out.println("\nMatching the word 'apples':");
        pattern = "apples";  // Pattern to match the word 'apples'
        regex = Pattern.compile(pattern); // Update compiled regex with new pattern
        matcher = regex.matcher(text);  // Recreate matcher object with new pattern

        // Find and print occurrences of the word 'apples'
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());  // Print 'apples' if found
        }
    }
}
