public class Generics {
    public static void main(String[] args) {


        Box<String> stringBox = new Box<>(); // T is String
        stringBox.setValue("Hello");
        System.out.println(stringBox.getValue()); // Output: Hello

        Box<Integer> intBox = new Box<>(); // T is Integer
        intBox.setValue(123);
        System.out.println(intBox.getValue()); // Output: 123



    }
}




class Box<T> { // <T> means the type will be decided later
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}



/*Type Safety: Ensures only valid types are added.
Code Reusability: Same code can work with multiple types.
Readability: Reduces the need for type casting, making code cleaner.
Runtime Safety: Catch type errors during compilation instead of at runtime.*/



class Box1<T> {
    T value;
    void set(T v) {
        value = v; }
    T get() {
        return value;
    }

    <T> void print(T item) {
        System.out.println(item); }

    interface Container<T>
    {
        void add(T item);
        T get();
    }



}
