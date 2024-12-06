import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        // Fixed the class name from Greeting to Greetings
        Greetings greeting = (name) -> System.out.println("Hello, " + name);  // Lambda expression implementing Greetings interface
        greeting.sayHello("Alice");  // Call sayHello method

        // ClassName::methodName

        // Using method reference to call the static method square from MathUtils class
        Function<Integer, Integer> square = MathUtils::square;
        System.out.println(square.apply(5)); // Output: 25

        // Using instance method reference
        FunctionalInterfaces obj = new FunctionalInterfaces();
        Consumer<String> printer = obj::printMessage;
        printer.accept("Hello, Method Reference!"); // Calls printMessage method

        // Simplified comparator using lambda
        List<String> names = Arrays.asList("Alice", "Bob", "Eve");
        names.sort((a, b) -> a.compareTo(b)); // Lambda simplifies the comparator
        System.out.println(names); // Output: [Alice, Bob, Eve]
    }

    // Reference to an Instance Method of a Particular Object
    void printMessage(String msg) {
        System.out.println(msg);
    }
}

// Fixed the name to 'Greetings' (from 'Greeting')
interface Greetings {
    void sayHello(String name);
}

interface CalculatorI {
    int calculate(int a, int b);
}

class MathUtils {
    static int square(int x) {
        return x * x;
    }
}

// Comparator implementation for sorting names (already simplified using lambda in the main method)
class NameComparator implements Comparator<String> {
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
}
