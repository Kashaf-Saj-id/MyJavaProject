package Encapsulation;

public class Human {

    // Private fields to store the name and age of a human
    private String name;
    private int age;

    // Setter method for name: Allows setting a value for the name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for age: Allows setting a value for the age
    public int setAge(int age) {
        return this.age = age;
    }

    // Getter method for name: Returns the value of the name
    public String getName() {
        return name;
    }

    // Getter method for age: Returns the value of the age
    public int getAge() {
        return age;
    }
}