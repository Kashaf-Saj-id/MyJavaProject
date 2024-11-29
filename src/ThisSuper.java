public class ThisSuper {
    public static void main(String[] args) {

        //B b = new B();
        B a = new B(4);
    }
}


class A{

 public A(){
     super();          //every constructor there is always super wether you call it or not
     System.out.println("This is A");
 }

 public A ( int n){
     super();
     System.out.println("This is A's perameterized constructor");
 }
}

class B extends A{

    public B(){
        super();                //this super will execute parent class constructor
        System.out.println("This is B constructor");
    }

    public B (int n){
        this();                   // Will execute the constructor of same class
        System.out.println("In B's parameterized constructor");
    }

}
