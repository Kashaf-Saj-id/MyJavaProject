package StreamPackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 30, 15);

        // Find the maximum number
        int max = numbers.stream()
                .max(Comparator.naturalOrder())  // Compare elements in natural order
                .orElseThrow();                 // Handle if the list is empty

        System.out.println("Maximum: " + max);  // Output: 30



        // Find the minimum number
        int min = numbers.stream()
                .min(Comparator.naturalOrder())  // Compare elements in natural order
                .orElseThrow();                 // Handle if the list is empty
        System.out.println("Minimum: " + min);  // Output: 5
    }
}