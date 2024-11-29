import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfaces {
    public static void main(String[] args) {


        Greeting greeting = (name) -> System.out.println("Hello, " + name);
        greeting.sayHello("Alice");


                                            //ClassName::methodName

        Function<Integer, Integer> square = MathUtils::square;
        System.out.println(square.apply(5)); // Output: 25


        FunctionalInterfaces obj = new FunctionalInterfaces();
        Consumer<String> printer = obj::printMessage;
        printer.accept("Hello, Method Reference!");

//Without Functional Interface: You write a verbose comparator class:
//        List<String> names = Arrays.asList("Alice", "Bob", "Eve");
//        Collections.sort(names, new NameComparator());
//        System.out.println(names); // Output: [Alice, Bob, Eve]

        List<String> names = Arrays.asList("Alice", "Bob", "Eve");
        names.sort((a, b) -> a.compareTo(b)); // Lambda simplifies the comparator
        System.out.println(names); // Output: [Alice, Bob, Eve]


    }


    //Reference to an Instance Method of a Particular Object
    void printMessage(String msg) {
        System.out.println(msg);
    }
    }




interface Greetings{
    void sayHello(String name);
}

interface CalculatorI{
    int calculate(int a, int b);
}



class MathUtils {
    static int square(int x) {
        return x * x;
    }
}



class NameComparator implements Comparator<String> {
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
}
