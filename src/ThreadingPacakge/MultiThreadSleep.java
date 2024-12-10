package ThreadingPacakge;

public class MultiThreadSleep {
    public static void main(String[] args) {

        //Implementing Multitasking
        Task1 task1 = new Task1();
        task1.start();


        Task2 task2 = new Task2();
        task2.start();


    }
}



//Multipe Threading
class Task1 extends Thread{
    public void run(){
        for(int i=0;i <=5; i++){
            System.out.println("Task1 class is running: " + i );

            //Blocked/waiting: Temporarily Pause a thread for a while.

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class Task2 extends Thread{
    public void run(){
        for(int i=0; i <=5; i++){
            System.out.println("Task2 class is running: " + i );

            try {
                Thread.sleep(100);     //WAITING STATE
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
