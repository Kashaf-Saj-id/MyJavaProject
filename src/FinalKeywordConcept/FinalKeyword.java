package FinalKeywordConcept;

public class FinalKeyword {

    public static void main(String[] args) {
        // Using the 'final' keyword with a variable
        final int max_speed = 120;

        // Uncommenting the following line will cause an error because 'max_speed' is final and cannot be reassigned
        // max_speed = 20;  // Error: cannot assign a value to a final variable

        // Creating an instance of the Parent class and calling the final method
        Parent parent = new Parent();
        parent.display();
    }
}
