package StreamPackage;

import java.util.Arrays;
import java.util.List;

public class MapStream {
    public static void main(String[] args) {

        List<String> values = Arrays.asList("Haris", "Burhan", "Khubaib", "Hamza");

        values.stream()
                .map(String :: toUpperCase)
                .forEach(System.out::println);

    }
}
