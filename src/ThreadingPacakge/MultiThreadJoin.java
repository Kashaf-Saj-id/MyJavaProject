package ThreadingPacakge;

public class MultiThreadJoin {
    public static void main(String[] args) throws InterruptedException {

        myThread t1 = new myThread();
        t1.start();
        try {       // Main thread waits for t1 to finish
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        myThread t2 = new myThread();   // Starts Thread 2 after t1 completes
        t2.start();
        t2.join();   //WAITING STATE

        myThread t3 = new myThread();
        t3.start();
        t3.join();


        //DEAD STATE - TERMINATED
        System.out.println("Main thread finished!");
    }
}





class myThread extends Thread{
    public void run(){
        for (int i =0; i <=5; i++){
            //Thread.currentThread().getName() to get which thread is running

            System.out.println(Thread.currentThread().getName()+ " is running: "+i);

        }
    }
}