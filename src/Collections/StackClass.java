package Collections;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(70);
        System.out.println(s1);


        //pop from the last beacuse LIFO
        int poped = s1.pop();
        System.out.println("Popped element:" +poped);
        System.out.println(s1);

        //top of the stack
        int top = s1.peek();
        System.out.println("To element of array: "+ top);
        System.out.println(s1);

        //If stack is empty
        System.out.println(s1.isEmpty());

        System.out.println("Position of 10 in stack: "+ s1.search(20) );
    }
}
