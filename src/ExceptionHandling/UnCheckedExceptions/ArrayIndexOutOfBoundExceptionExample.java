package ExceptionHandling.UnCheckedExceptions;

//his exception occurs when you try to
// access an array element using an invalid index.
public class ArrayIndexOutOfBoundExceptionExample {
    public static void main(String[] args) {

        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+ e.getMessage());
        }

    }
}
