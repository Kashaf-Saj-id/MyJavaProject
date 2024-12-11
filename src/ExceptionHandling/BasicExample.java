package ExceptionHandling;

public class BasicExample {
    public static void main(String[] args) {

        try{
            int result = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Error division by zero is not allowed");
        }
        finally {
            System.out.println("This is always executed ");
        }
    }
}
