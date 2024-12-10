package ThreadingPacakge;

public class Synchronization {
    public static void main(String[] args) {
        Counter c1 = new Counter();

        SyncClass t1 = new SyncClass(c1);
        t1.start();

        SyncClass t2 = new SyncClass(c1);
        t2.start();

    }

}


class Counter{
    private  int count;

    // Synchronized method ensures only one thread can access it at a time
    public synchronized void increment(){
        count ++;
        System.out.println(" Count: "+count);
    }
}


class SyncClass extends Thread{
private Counter counter;

public SyncClass(Counter  counter){
    this.counter = counter;
}


    public void run() {
        // Each thread tries to increment the counter 5 times
        for (int i = 1; i <= 5; i++) {
            counter.increment();
        }
    }

}




