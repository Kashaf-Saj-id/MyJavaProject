package Collections;

import java.util.LinkedHashSet;

public class LinkHashSetClass {
    public static void main(String[] args) {

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
    }
}
