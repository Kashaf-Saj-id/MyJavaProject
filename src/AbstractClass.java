public class AbstractClass {
    public static void main(String[] args) {
 Car1 car  = new Wagon();
 car.drive();



// ----- IC
 AAA obj = new AAA();
 obj.print1();
 AAA.BBB obj2 = obj.new BBB();//we should use object of main class ... if static inner ckass thenn: AAA.VVV obj2 = new AAA.BBB();

 Do dog = new Do("wolf", "Big", 1000);
 dog.makeNoise();



 //------AIC
        AAAA a1 = new AAAA(){
            public void show() {
                System.out.println(" In the  main: new AAAAA");
            }
        };
        a1.show();


        BBBB b1 =new BBBB();
        b1.show();


        AAAA a2 = new AAAA() {
            @Override
            public void show() {
                System.out.println(" In the  ANONYMUS CLASS from abstract AAAA" );
            }
        };
        a2.show();

    }
}

 abstract class Car1{
    public abstract void drive();       // Declaring a Method

    public void music(){                //Non abstract method
        System.out.println("Play Music");
    }

}



class Wagon extends Car1{             // It should have abstract method of parent class

  public void drive() {
       System.out.println("Drive the Car");
   }
}



class  AAA{
    String name;
    int age;

    public void print1(){
 System.out.println("In the main class AAA");
    }

    class BBB{

        public void print(){
            System.out.println(" In the subclass BBB");
        }
    }
}




//----course video------

abstract class Ani{
    protected String type;
    private String size;
    private double weight;

    public Ani(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

}


class Do extends Ani{
    public Do(String type, String size, double weight) {
        super(type, size, weight);
    }

    public void move(String speed){

    }
    public void makeNoise(){
      if (type =="wolf"){
          System.out.println("howling");
      }
      else{
          System.out.println("woof!");
      }
    }
}





abstract class AAAA{
    abstract public void show();
}

class BBBB {
    public void show(){
        System.out.println(" In the  main: BBBB " );
    }
}