package ExceptionHandling.UnCheckedExceptions;
//This exception occurs when you
// try to use an object reference that is null.
public class NullPointerExceptionExample {
    public static void main(String[] args) {

        try{
        String str = null;
        System.out.println(str.length());}
        catch(NullPointerException e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}
