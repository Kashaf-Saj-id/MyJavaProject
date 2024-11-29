public class Interface {
    public static void main(String[] args) {

        C obj = new C();
        obj.method1();
        obj.method2();

    }
}


interface D{
    int age = 23;
    String area = "2x4";
     void method1();
     void method2();
}

class C implements D{
    @Override
    public void method1() {
     System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
}

