package ThreadingPacakge;

public class Demo{
    public static void main(String[] args) {

        //Implementing though class simple extending from thread
        MyClass1 c1 = new MyClass1();  //BORN STATE
        //start() launches the thread and calls the run() method.
        c1.start(); //READY STATE


        //Implementing  through Runnable Interface
        MyClass2 c2 = new MyClass2();
        Thread t1 = new Thread(c2); //Created but not yet started.
        t1.start(); //Starts with thread


    }

}


//Simple extending from Thread
class MyClass1 extends Thread{
    //The run() method contains the code the thread executes.
     public void run(){
         for(int i=0; i<=5; i++){
             System.out.println(" Thread: "+ i);
         }
     }

}


//Implementing Runnable so class can extend another class
class MyClass2 implements Runnable{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("Runnable Thread: "+ i);
        }
    }
}

