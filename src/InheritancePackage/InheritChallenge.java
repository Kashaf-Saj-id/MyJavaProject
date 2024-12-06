package InheritancePackage;

public class InheritChallenge {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee e1 = new Employee("Amna", "12/12/2024", 23, "01/01/2023");

        // Printing the Employee details
        System.out.println(e1);
        System.out.println("Age = " + e1.getAge());  // Calculates and prints the age
        System.out.println("Pay = " + e1.collectPay());  // Collects and prints the pay
    }
}
