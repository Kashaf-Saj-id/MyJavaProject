package Collections;

import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {

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
