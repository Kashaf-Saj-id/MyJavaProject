package GenericsPackage;

class Box<T> { // <T> means the type will be decided later
    private T value;

    // Method to set the value of the box
    public void setValue(T value) {
        this.value = value;
    }

    // Method to get the value of the box
    public T getValue() {
        return value;
    }
}
