package Collections;

import java.util.HashSet;

public class HashSetClass {
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
    }
}
