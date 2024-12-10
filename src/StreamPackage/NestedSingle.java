package StreamPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NestedSingle {
    public static void main(String[] args) {

        List<List<Integer>> nextedlist = Arrays.asList(
                Arrays.asList(1,35,6),
                Arrays.asList(1,2,3)
        );

        List<Integer> singlelist = nextedlist.stream()
                .flatMap(List :: stream)
                .collect(Collectors.toList());

        System.out.println(singlelist);
    }
}
