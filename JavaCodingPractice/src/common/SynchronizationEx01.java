package common;

/**
 * Synchronization is used to control access to a shared resource by multiple threads.
 * It prevents multiple threads from accessing a shared resource concurrently,
 * which can lead to inconsistent data or unexpected behavior.
 * Synchronization is often used to ensure thread safety when a shared resource,
 * like a variable or an object, is accessed by multiple threads.
 */
class Counter {
    private int count = 0;

    // Synchronized method to make this thread-safe
    public synchronized void increment() {
        count++; // Only one thread can increment at a time
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizationEx01 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to complete
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}

