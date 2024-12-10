package StreamPackage;

import java.util.Arrays;
import java.util.List;

public class SortStream {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(14,5,67,3,7,9,3,2);

        values.stream()
                .sorted()
                .forEach(System.out::println);


    }
}
