package StreamPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForCollect {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1,3,2,4,5,6,7,6);

        //Usage of FOR EACH LOOP
        values.stream()
                .forEach(System.out::println);


        //AT FIRT SORT THE STREAM AND THEN CONVERT IT INTO LIST
        List<Integer> list1 = values.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(list1);
    }
}
