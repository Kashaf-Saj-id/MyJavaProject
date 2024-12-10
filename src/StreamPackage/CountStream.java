package StreamPackage;

import java.util.Arrays;
import java.util.List;

public class CountStream {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2,3,4,5,6,77,88,89,5,4,3,10,235,67);

       long countedValue =  values.stream()
                .filter(num -> num >= 10)
               .count();
        System.out.println(countedValue);





    }
}
