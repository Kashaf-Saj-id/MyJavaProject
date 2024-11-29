public class FinalKeyword {

    public static void main(String[] args) {
        final int max_speed =120;
        // max_speed =20;  -- will give error
    }
}

class Parent{
    final void display(){
        System.out.println("This is a Final method");
    }
}

class Child extends Parent{
//    void display(){         --- Error will generate
//        System.out.println(" Trying to override");
//    }
}


final class Anim {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

//class Dog extends Animal { // Error: Cannot inherit from final class
//}