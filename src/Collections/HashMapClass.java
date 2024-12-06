package Collections;

import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();


        //Add key value pairs
        map1.put ("Amna", 10);
        map1.put("Aqdas", 100);
        map1.put("Bisma", 70);


        //Getting the value
        System.out.println( "Aqdas's grade is: "+map1.get("Aqdas"));

        //Does the map contains key
        System.out.println( "Does the map contains key Burhan? "+ map1.containsKey("Amna"));

        //Does the map contains value ?
        System.out.println( "Does the map contains value 100? "+ map1.containsValue(100));

        //Iterate over the keys
        for(String k:map1.keySet()){
            System.out.println(k);
        }
        //Iterate over the values
        for(Integer i:map1.values()){
            System.out.println(i);
        }

        map1.remove("Amna");
        System.out.println(map1);


        //map1.clear();
    }
}
