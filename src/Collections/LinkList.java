package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {



        //---------------LinkedList------------------------

        LinkedList<String> List3 = new LinkedList<>();

        //----Adding elements
        List3.add("Cat");
        List3.add("Dog");
        System.out.println(List3); // Output: [Cat, Dog]
        //-----Adding by index
        List3.add(0, "Elephant");
        System.out.println(List3);

        //---Getting element in linkedlist
        System.out.println(List3.get(1));

        //---Setting elements in LINKEDLIST
        List3.set(1, "Duck");
        System.out.println(List3);

        //---Removing element from start
        List3.remove(1);
        System.out.println(List3);

        List3.add(0, "Snake");
        List3.add(1, "Monkey");
        System.out.println(List3);

        //---Removing first and last
        List3.removeFirst();
        List3.removeLast();
        System.out.println(List3);

        //Iterating through the Linkedlist list (for-each)
        for (String k : List3) {
            System.out.println(k);
        }

        //Iterating through the Linkedlist (Traditional for loop)
        for (int I = 0; I < List3.size(); I++) {
            System.out.println(List3.get(I));
        }

        //Iterating through the linkedlist using Iterator
        Iterator<String> iterator1 = List3.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        List3.clear();
        System.out.println(List3);

        //------Creating Linkedlist with numbers
        LinkedList<Integer> List4 = new LinkedList<>();
        List4.add(23);
        List4.add(12);
        List4.add(100);
        List4.add(50);
        System.out.println(List4);

        //-------Sorting the linkedlist
        Collections.sort(List4);
        System.out.println(List4);



        //-------USING LinkedList AS QUEUE
        LinkedList<String> q1 = new LinkedList<>();

        //----Enqueue ----- Adding at the end
        q1.addLast("Subject 1");     //End of the array
        q1.addLast("Subject 2");
        q1.addFirst("Subject 0");    //front of queue
        System.out.println(q1);

        //-----Remove from the front (Dequeue)
        q1.removeFirst();
        System.out.println(q1);

        //Shows the element at front of queue
        System.out.println(q1.peekFirst());

        //Check if queue is empty
        System.out.println(q1.isEmpty());

        //Check the size of Queue
        System.out.println(q1.size());


    }
}
