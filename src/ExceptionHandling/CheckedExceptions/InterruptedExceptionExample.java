package ExceptionHandling.CheckedExceptions;

//This exception occurs when a thread is sleeping, waiting or
//performing some task and other thread interrupts it
public class InterruptedExceptionExample {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            try {
                // Simulating thread sleep for 1 second
                System.out.println("Thread is sleeping...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        });

        // Start the thread
        thread.start();

        // Interrupt the thread after 500 milliseconds (before it finishes sleeping)
        try {
            Thread.sleep(500);  // Wait for 500ms before interrupting
            thread.interrupt();  // Interrupt the sleeping thread
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}



//package ExceptionHandling.CheckedExceptions;
//
////This exception occurs when a thread is waiting, sleeping, or
//// performing some other operation, and another thread interrupts it.
//
//
//public class InterruptedExceptionExample {
//    public static void main(String[] args) {
//
//
//        try {
//            Thread.sleep(1000);
//        }
//        catch (InterruptedException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//
//    }
//}