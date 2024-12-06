package Encapsulation;

public class Encap {
    public static void main(String[] args) {

        // Creating an instance of Human class
        Human h = new Human();

        // Setting the values for name and age using setter methods
        h.setName("Amna");
        h.setAge(23);

        // Getting the values for name and age using getter methods
        System.out.println(h.getName());  // Output: Amna
        System.out.println(h.getAge());   // Output: 23
    }
}