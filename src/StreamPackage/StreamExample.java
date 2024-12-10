package StreamPackage;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        //List of numbers
        List<Integer> valueList = Arrays.asList(1,2,4,5,3,6);

        //Use Stream to filter even numbers and print it

        valueList.stream()               //Create a stream
                .filter(n->n%2 ==0)              //Filter even numbers
                .forEach(System.out::println);  //Processes Sequentially
    }
}
