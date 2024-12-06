package DesignPatternsPackage;

/**
 * Singleton class ensures that only one instance of the class is created.
 * The class uses different methods of creating a Singleton instance with thread-safety considerations.
 */
public class Singleton {

    // static Singleton d1 = new Singleton();  // Create a static instance of the class in the class
    // It's called Eager Instantiation, even when you are not using it, it creates it
    // Drawback: As this variable is static, it will be in memory whenever the class is loaded — Wastage of memory

    // static Singleton d1;  // Declaring the static reference for the Singleton instance

    private Singleton() {
        // Private constructor to prevent external instantiation of the class
    }

    // The following method is for **Lazy Initialization**
    // This allows the Singleton to be created only when needed.
    // public static Singleton getInstance() {
    //     if (d1 == null) {
    //         d1 = new Singleton();  // Lazy Initialization
    //     }
    //     return d1;
    // }

    // The following method is **Synchronized** method.
    // Synchronized means that if one thread is entering this method, other threads will wait.
    // This ensures thread-safety, but it reduces performance due to synchronization.
    // public static synchronized Singleton getInstance() {
    //     if (d1 == null) {
    //         d1 = new Singleton();  // Lazy Initialization
    //     }
    //     return d1;
    // }

    // **Double Checked Locking**:
    // This method improves performance by checking the null condition twice.
    // The first check is done without locking to avoid the overhead of synchronization if the object is already created.
    // The second check inside the synchronized block ensures thread-safety while creating the instance.

    private static volatile Singleton d1;  // Volatile ensures visibility across threads

    /**
     * Thread-safe Singleton retrieval method using double-checked locking.
     */
    public static Singleton getInstance() {
        if (d1 == null) {  // First check without locking
            synchronized (Singleton.class) {
                if (d1 == null) {  // Second check with locking to ensure thread-safety
                    d1 = new Singleton();  // Lazy initialization of the Singleton instance
                }
            }
        }
        return d1;
    }
}
