package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListClass {
    public static void main(String[] args) {

                //----------ARRAY LIST ---------
                List<String> list1 = new ArrayList<>();
                list1.add("Apple");
                list1.add("Banana");
                System.out.println(list1);


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

                System.out.println("Filtered Collections.Arraylist: " + filtered);


            }

        }
