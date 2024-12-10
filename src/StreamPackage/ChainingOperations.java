package StreamPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChainingOperations {

    public static void main(String[] args) {


        List<String> values = Arrays.asList("Kashaf", "Eesha", "Alishba", "Saliha", "SameEN", "Saba");

        List<String> list2 = values.stream()
                .map(String::toUpperCase)
                .filter(word -> word.startsWith("S"))
                .sorted()
                .collect(Collectors.toList());

            System.out.println(list2);
    }
}
