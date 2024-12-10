package ThreadingPacakge;

public class DaemonThreadExample {
    public static void main(String[] args) {
        DaemonThread dt = new DaemonThread();

        dt.setDaemon(true);  // Set as daemon thread

        dt.start();

        try {
            Thread.sleep(5000);  // Let the main thread sleep for 5 seconds
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread finished");
    }
}


class DaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Daemon thread interrupted");
            }
        }
    }
}