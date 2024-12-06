package POJOClassExample;

public class PojoclassDemo {

    public static void main(String[] args) {
        // Creating instances of the Student class and printing their data
        for (int i = 0; i < 5; i++) {
            Student s1 = new Student("Amna", "fa13");
            // You can print or use the s1 object as needed
            System.out.println("Student Name: " + s1.name + ", ID: " + s1.id);
        }
    }
}
