import java.util.*;
import java.util.stream.Collectors;

class Arraylist {

    public static void main(String[] args) {

        //----------ARRAY LIST ---------
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        System.out.println(list1); // Output: [Apple, Banana]


        //------------Basic operations on List -------

        //------------ADDING AN ELEMENT
        list1.add("Apple");
        list1.add(0, "Orange");     // Add at index 0
        System.out.println(list1);

        //--------Accessing an element in array
        String item = list1.get(2);
        System.out.println(item);

        //------Updating an element in arraylist
        list1.set(3, "Pineapple");
        System.out.println(list1);

        //------Removing an Element in arraylist
        list1.remove(1);
        System.out.println(list1);

        list1.add(1, "Apple");
        System.out.println(list1);

        //------Checking the size of an arraylist
        System.out.println(list1.size());

        //-----checking whether list is empty
        System.out.println(list1.isEmpty());

        //----Returns the index of array
        System.out.println(list1.indexOf("Pineapple"));

        //Checking if the list contains
        System.out.println("Contains Banana? " + list1.contains("Banana"));

        //Iterating through list (Traditional For loop)
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        //-----Iterating Through list (For-each loop)
        for (String i : list1) {
            System.out.println(i);
        }

        //-----Iterating through list (iterator)
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Converting arraylist to simple array
        String[] arr1 = list1.toArray(new String[0]);
        System.out.println(arr1[2]);


        //CREATING AN ARRAYLIST TO SORT
        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(7);
        List2.add(0);
        List2.add(12);
        List2.add(9);

        System.out.println(List2);

        //------Sort an arrayList
        Collections.sort(List2);
        System.out.println("Sorted ArrayList: " + List2);

        //Filtering an arraylist
        ArrayList<Integer> filtered = List2.stream().filter(num -> num > 3).collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Filtered Arraylist: " + filtered);

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

        //------------VECTOR -------

        Vector<String> List5 = new Vector<>(); // Use ArrayList instead of Vector

        List5.add("Red");
        List5.add("Blue");
        List5.add("Gray");
        System.out.println(List5);

        //-----Adding element in vector
        List5.add(0, "Pink");
        System.out.println(List5);

        //----Removing at specific index
        List5.remove(3);
        System.out.println(List5);

        //----Size of a vector
        System.out.println(List5.size());

        //----Contains an element
        System.out.println(List5.contains("Green"));

        //----Reduces the size of vector to its current concurrency
        List5.trimToSize();
        System.out.println(List5);

        Vector<String> List6 = new Vector<>();
        List6.add("Apple");
        List6.add("GrapeFruit");
        List6.add("Cherry");
        System.out.println(List6);

        List6.add(1, "Mango");
        System.out.println(List6);

        System.out.println(List6.get(1));
    }
}
