package ObjectClassExample;

public class ObjectClassDemo {

    public static void main(String[] args) {
        // Creating a Stud object and printing it
        Stud s1 = new Stud("Amir", 27);
        System.out.println(s1);  // Output: Amir is 27

        // Creating a PrimarySchool object and printing it
        PrimarySchool ps1 = new PrimarySchool("Anza", 12, "Abid");
        System.out.println(ps1);  // Output: Anza is 12 has parent Abid
    }
}
