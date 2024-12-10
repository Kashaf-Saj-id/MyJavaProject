package StreamPackage;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraytoStream {
    public static void main(String[] args) {
        // Array of integers
        Integer[] numbers = {1, 2, 3, 4, 5};

        // Convert array to stream
        Stream<Integer> stream1 = Arrays.stream(numbers);

        // Process the stream (e.g., print all elements)
        stream1.forEach(System.out::println);  // Output: 1 2 3 4 5
    }
}