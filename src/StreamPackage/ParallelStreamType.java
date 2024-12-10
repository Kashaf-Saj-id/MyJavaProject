package StreamPackage;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamType {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,3,5,67,8,9,5,3,2);

        values.parallelStream()
                .forEach(System.out::println); //Will print in different order due to parallelism
    }
}
