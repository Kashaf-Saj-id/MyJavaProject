package GenericsPackage;

public class Generics {
    public static void main(String[] args) {
        // Creating a Box with String type
        Box<String> stringBox = new Box<>(); // T is String
        stringBox.setValue("Hello");
        System.out.println(stringBox.getValue()); // Output: Hello

        // Creating a Box with Integer type
        Box<Integer> intBox = new Box<>(); // T is Integer
        intBox.setValue(123);
        System.out.println(intBox.getValue()); // Output: 123
    }
}
