package Collections;

import java.util.*;

public class IteratorClass {
    public static void main(String[] args) {

        //-----------Iterator -----------------
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using For-Each Loop
        System.out.println("Using For-Each Loop:");
        for (String item : list) {
            System.out.println(item);
        }

        // Using Basic For Loop (with index)
        System.out.println("Using Basic For Loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



        //------ Iterator over a SET---------
        HashSet<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Horse");

        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        // Using For-Each Loop
        System.out.println("Using For-Each Loop:");
        for (String item : set) {
            System.out.println(item);
        }




        //----------Iteraotor over a map -----------
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Using Iterator on entrySet
        System.out.println("Using Iterator:");
        Iterator<Map.Entry<Integer, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> entry = iterator1.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Using For-Each Loop on entrySet
        System.out.println("Using For-Each Loop on entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Using For-Each Loop on keySet
        System.out.println("Using For-Each Loop on keySet:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Using For-Each Loop on values
        System.out.println("Using For-Each Loop on values:");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }
    }
}
