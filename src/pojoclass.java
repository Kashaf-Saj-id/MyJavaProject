public class pojoclass {
    public static void main(String[] args) {
    for (int i=0; i<5; i++){
        Student s1 = new Student("Amna", "fa13");



    }
    }
}

class Student{
    public String id;
    public String name;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }


}
