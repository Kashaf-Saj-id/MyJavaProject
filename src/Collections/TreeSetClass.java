package Collections;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {

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

            set3.remove("yellow");
            System.out.println("Removing an element from Set: "+  set3);

            System.out.println("Does Set contains pink: "+set3.contains("Pink"));
            System.out.println(" First element in set: " +set3.first());

            for(String i: set3){
                System.out.println(i);
            }

        }

    }


