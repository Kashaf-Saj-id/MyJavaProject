package Collections;

import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        //--------------TREE MAP------------
        TreeMap<String, Integer> Grades  = new TreeMap<>();

        // Add key-value pairs
        Grades.put("Alice", 90);
        Grades.put("Bob", 85);
        Grades.put("Charlie", 92);

        // Print the TreeMap
        System.out.println("TreeMap: " + Grades);

        // Retrieve a value using a key
        System.out.println("Grade of Alice: " + Grades.get("Alice"));

        // Iterate through the map
        System.out.println("Iterating through TreeMap:");
        for (String key : Grades.keySet()) {
            System.out.println(key + ": " + Grades.get(key));
        }

        // Get the first and last keys
        System.out.println("First key: " + Grades.firstKey());
        System.out.println("Last key: " + Grades.lastKey());

        // Higher and lower keys
        System.out.println("Higher key than Bob: " + Grades.higherKey("Bob"));
        System.out.println("Lower key than Bob: " + Grades.lowerKey("Bob"));



    }
}
