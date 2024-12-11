package ExceptionHandling.UnCheckedExceptions;

import java.util.Stack;

public class EmptyStackExceptionExample {
    public static void main(String[] args) {


    Stack<Integer> stack1 = new Stack<>();
        System.out.println(stack1.pop()); // Throws EmptyStackException

}}
