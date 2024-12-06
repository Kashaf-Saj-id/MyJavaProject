package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMapClass {
    public static void main(String[] args) {

        //------Linked Hash Map-----------

        LinkedHashMap<String, Integer> studentGrades = new LinkedHashMap<>();

        // Add key-value pairs
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 92);

        // Retrieve a value using a key
        System.out.println("Alice's grade: " + studentGrades.get("Alice"));  // Output: 90

        // Check if a key exists
        System.out.println("Does the map contain Bob? " + studentGrades.containsKey("Bob"));  // Output: true

        // Check if a value exists
        System.out.println("Does the map contain grade 92? " + studentGrades.containsValue(92));  // Output: true

        // Iterate over the keys (insertion order)
        System.out.println("Keys in the map (insertion order):");
        for (String key : studentGrades.keySet()) {
            System.out.println(key);
        }

        // Iterate over key-value pairs
        System.out.println("Entries in the map (insertion order):");
        for (
                Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Remove a key-value pair
        studentGrades.remove("Bob");
        System.out.println("Map after removing Bob: " + studentGrades);

        // Clear the map
        studentGrades.clear();
        System.out.println("Is the map empty? " + studentGrades.isEmpty());
    }
}