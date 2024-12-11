package ExceptionHandling;

public class CustomExceptionExamples {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", 17, 8);    // Invalid age
        Student student2 = new Student("Bob", 20, 11);     // Invalid grade (out of range)
        Student student3 = new Student("Charlie", 22, 9);  // Valid

        // Register each student
        try {
            student1.register();  // Will throw InvalidAgeException
        } catch (InvalidAgeException | InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            student2.register();  // Will throw InvalidGradeException
        } catch (InvalidAgeException | InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            student3.register();  // Will succeed
        } catch (InvalidAgeException | InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



//For Checked Exceptions
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);  // Pass message to Exception class
    }
}


//For Unchecked Exceptions
class InvalidGradeException extends RuntimeException {
    public InvalidGradeException(String message) {
        super(message);  // Pass message to RuntimeException class
    }
}


class Student {
    private String name;
    private int age;
    private double grade;

    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to register student with both checked and unchecked exceptions
    public void register() throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above. Provided: " + age);
        }
        if (grade < 0 || grade > 10) {
            throw new InvalidGradeException("Invalid grade! Grade must be between 0 and 10. Provided: " + grade);
        }
        System.out.println("Student " + name + " successfully registered with grade " + grade + "!");
    }
}