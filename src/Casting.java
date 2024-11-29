public class Casting {
    public static void main(String[] args) {

        CastA a = new CastB();       // 'a' has a refrence of b BUT object of b// We have an object of subclass but a refrence of PArent class
        a.show1();

        CastB a1 = (CastB) a;     //Downcasting
        a1.show1();
        a1.show2();




    }
}


class CastA{        //A has no idea what B is

    public void show1(){

        System.out.println("Class A show method");
    }

}

class CastB extends CastA{         //B has idea what A is


    public void show2() {
        System.out.println("Class B show method");
    }
}
