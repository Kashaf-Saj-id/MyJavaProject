public class DesginPatterns {

    /*Many software developers face common problem, so why not create a solution so everyone cn use it.
    - Its was introduced in 1984 by a book written by 4 people also known as gang of 4  having 2 major points

    - Prefer composition over inheritance
    - Design patterns


    Types of design patterns (23 basic):
    -Creational
    -Structural
    -behvioural

Creational: These patterns are all about how to create objects.
    -Singleton: Allow to create only 1 instance of class (create static instance, private constructor, static method with reutn type of claa)
    -Factory : It is basically a way to create objects without specifying their exact class

Structural: Basically deals with how to organize an object in system ..(Deal with object composition and relationships to create large, flexible structures.)
    */



    public static void main(String[] args) {



        //Singleton d1  = Singleton.getInstance();
        // Singleton d2 = Singleton.getInstance();


        Thread t1 = new Thread(new Runnable() {        //Creating thread 1
            @Override
            public void run() {
                Singleton d1 = Singleton.getInstance();       //Both threads are creating same object
            }
        });

        Thread t2 = new Thread(new Runnable() {          //creating thread 2
            @Override
            public void run() {
                Singleton d1 = Singleton.getInstance();
            }
        });



        t1.start();

//
//        try {                                         //For DOUBLE CHECKED LOCKING
//            Thread.sleep(10);
//        }catch (Exception e){              //But thats one way also waiting 10 milli seconds is waste of time
//
//        }


        t2.start();







        //--------------------Factory Design Pattern--------------------



        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw(); // Output: Drawing a Circle

        Shape shape2 = factory.getShape("SQUARE");
        shape2.draw(); // Output: Drawing a Square






        //-----------------------Abstract Factory Pattern----------
        ToyFactory redFactory = new RedToyFactory();
        Cary redCar = redFactory.createCar();
        Doll redDoll = redFactory.createDoll();
        redCar.assemble();  // Output: Assembling a Red Car
        redDoll.assemble(); // Output: Assembling a Red Doll

        // Order a Blue Toy Set
        ToyFactory blueFactory = new BlueToyFactory();
        Cary blueCar = blueFactory.createCar();
        Doll blueDoll = blueFactory.createDoll();
        blueCar.assemble();  // Output: Assembling a Blue Car
        blueDoll.assemble(); // Output:
    }
}
















class Singleton{                       //------SINGLTON CLASS-------
   //static Singleton d1 =new Singleton();    //create a static  instance of class in class
   // Its called Eager Instantiation, even when you are not using it creates it  //Drawback: As this variable is static therefore it will be in memory whenever the class is loaded---Wastage of memory

    //static Singleton d1;


    private  Singleton(){

    }                           // Dont allow user to use default constructor so make it private



//    public static Singleton getInstance(){      //create a method of having return tyoe of class
//
//        //It will allow to create multiple objects in main. So, Apply 'if'
//        if (d1 == null)
//        {
//            d1 = new Singleton();            //Addition for lazy Initiation
//        }
//
//        return d1;
//    }




//    public static  synchronized Singleton getInstance(){    //Syncronized means: that if 1 thread is entering in this method , than the other will wait
//        if(d1 == null){
//            d1 =new Singleton();
//        }
//        return d1;
//    }



    /*public static Singleton getInstance(){    //Double Checked Locking
        if(d1 == null) {                //First checked without locking
            synchronized (Singleton.class)

            {
                if (d1 == null) {            //second check without locking
                    d1 = new Singleton();
                }

            }
        }
        return d1;
    }*/


    private static volatile Singleton d1;     // Volatile ensures visibility across threads

    public static Singleton getInstance() {
        if (d1 == null) { // First check without locking
            synchronized (Singleton.class) {
                if (d1 == null) { // Second check with locking
                    d1 = new Singleton();
                }
            }
        }
        return d1;
    }

}







//--------------Factory Design Pattern



/*     -----Without factory
   class Circle {
   void draw() {
       System.out.println("Drawing a Circle");
   }
}

class Square {
   void draw() {
       System.out.println("Drawing a Square");
   }
}

public class Main {
   public static void main(String[] args) {
       Circle circle = new Circle();
       circle.draw();

       Square square = new Square();
       square.draw();
   }
}
*/




interface Shape{
    void draw();
}

class Circle implements Shape{
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class ShapeFactory{
    public Shape getShape(String shapeTyp){
        if (shapeTyp ==null){
            return null;
        }
        if (shapeTyp.equalsIgnoreCase("circle")){
            return new Circle();
        }
        else if(shapeTyp.equalsIgnoreCase("Square")){
            return new Square();
        }
        return  null;
    }
}








//---------------------Abstract Factory Pattern---------
interface Cary {
    void assemble();
}
                                          // These both interfaces are abstract Products
interface Doll {
    void assemble();
}


class RedCar implements Cary {             //these are concrete products
    public void assemble() {
        System.out.println("Assembling a Red Car");
    }
}

class RedDoll implements Doll {
    public void assemble() {
        System.out.println("Assembling a Red Doll");
    }
}

class BlueCar implements Cary {
    public void assemble() {
        System.out.println("Assembling a Blue Car");
    }
}

class BlueDoll implements Doll {
    public void assemble() {
        System.out.println("Assembling a Blue Doll");
    }
}



interface ToyFactory {            //Abstract factory
    Cary createCar();
    Doll createDoll();
}

class RedToyFactory implements ToyFactory {       //Concrete factories
    public Cary createCar() {
        return new RedCar();
    }
    public Doll createDoll() {
        return new RedDoll();
    }
}

class BlueToyFactory implements ToyFactory {
    public Cary createCar() {
        return new BlueCar();
    }
    public Doll createDoll() {
        return new BlueDoll();
    }
}

