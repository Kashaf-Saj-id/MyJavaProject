package StreamPackage;

import java.util.Arrays;
import java.util.List;

public class MoreOperations {
    public static void main(String[] args) {

        //------Distinct(Remove duplicates)-------
        List<String> values = Arrays.asList("Asma", "Amna","Bisma", "Momina", "Asma");

        values.stream()
                .distinct()
                .forEach(System.out::println);






        // ----------LIMIT, SKIP (n elements)-------
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .skip(2)      // Skip first 2 elements
                .limit(2)     // Take the next 2 elements
                .forEach(System.out::println);



        //------------REDUCE(combines all elements into single result)-----
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        int sum = nums.stream()
                .reduce(0, (a, b) -> a + b);  // Add all numbers
        System.out.println(sum);




    }
}
