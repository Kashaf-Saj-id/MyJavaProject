package ThreadingPacakge;

public class ThreadPriorities {
    public static void main(String[] args) {

        Prior t1 = new Prior();
        t1.setPriority(Thread.MIN_PRIORITY);

        Prior t2 = new Prior();
        t2.setPriority(Thread.MIN_PRIORITY);

        Prior t3 = new Prior();
        t3.setPriority(Thread.MIN_PRIORITY);

        Prior t4 = new Prior();
        t4.setPriority(Thread.MAX_PRIORITY);

        Prior t5 = new Prior();
        t5.setPriority(Thread.NORM_PRIORITY );

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


        /*Output:
        Thread-2 has priority 1
        Thread-3 has priority 10
        Thread-4 has priority 5
        Thread-1 has priority 1
        Thread-0 has priority 1
         */

    }
}




class Prior extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " has priority " + getPriority());
    }
}

