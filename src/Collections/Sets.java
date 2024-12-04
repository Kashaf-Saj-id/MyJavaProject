package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        //----Hash Set-------
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");
        set1.add("grape Fruit");
        set1.add("Kiwi");
        set1.add("Grapes");
        set1.add("Coconut");

        System.out.println(set1);

        //REMOVE
        set1.remove("Banana");
        System.out.println(set1);

        System.out.println("\n");
        //CHECK IF CONTAINS
        System.out.println("SET HAS PINEAPPLE: "+ set1.contains("Pineapple"));

        System.out.println("\n");
        //SIZE
        System.out.println(" Size of the Set is: "+ set1.size());

        System.out.println("\n");
        //isEmpty
        System.out.println("Set is empty? : "+ set1.isEmpty());


        System.out.println("\n");
        set1.forEach(set1a -> System.out.println(set1a));

        System.out.println("\n");
        //Iterate by using for each loop
        for( String i: set1){
            System.out.println(i);
        }



        //--------LINKED HashSet---------

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Blue");
        set2.add("Pink");
        set2.add("Orange");
        set2.add("Gray");
        set2.add("yellow");
        set2.add("yellow");


        System.out.println("\n"+ set2);

        set2.remove("yellow");
        System.out.println(set2);

        System.out.println(" Does set contains Pink color? " + set2.contains("Pink"));

        System.out.println("Size of a SET is: "+ set2.size());
        System.out .println( "Is the Set empty? " + set2.isEmpty());

        for(String i2 : set2){
            System.out.println("\n" +i2);
        }
        set2.forEach(set2s -> System.out.println(set2s));



        //--------TREE SET ------
        TreeSet<String> set3 = new TreeSet<>();
        set3.add("Blue");
        set3.add("Pink");
        set3.add("Orange");
        set3.add("Gray");
        set3.add("yellow");
        set3.add("yellow");
        set3.add("Brown");

        //Give the results in Alphbatic sequence
        System.out.println("\n"+ set3);

        set1.remove("yellow");
        System.out.println("Removing an element from Set: "+  set3);

        System.out.println("Does Set contains pink: "+set3.contains("Pink"));
        System.out.println(" First element in set: " +set3.first());

        for(String i: set3){
            System.out.println(i);
        }

    }

}
