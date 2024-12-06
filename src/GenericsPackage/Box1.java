package GenericsPackage;

class Box1<T> {
    T value;

    // Method to set the value of the box
    void set(T v) {
        value = v;
    }

    // Method to get the value of the box
    T get() {
        return value;
    }

    // Generic method to print any type of item
    <T> void print(T item) {
        System.out.println(item);
    }

    // A generic interface defining a container
    interface Container<T> {
        void add(T item);
        T get();
    }
}
