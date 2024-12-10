package StreamPackage;

import java.util.Arrays;
import java.util.List;

public class FilterStream {
    public static void main(String[] args) {

        List<String> values = Arrays.asList("Amna", "Bisma", "Momina", "Hafsa");

        values.stream()
                .filter( name -> name.startsWith("B"))
                .forEach(System.out::println);

    }
}
