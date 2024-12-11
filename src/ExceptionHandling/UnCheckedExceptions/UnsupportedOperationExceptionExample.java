package ExceptionHandling.UnCheckedExceptions;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//his exception occurs when an operation is not supported by a
//collection or object.

public class UnsupportedOperationExceptionExample {
    public static void main(String[] args) {

        List<Integer> list = Collections.unmodifiableList(Arrays.asList(1,2,3,4));
        list.add(2);
    }
}
