package common;

/**
 * In Java, the volatile keyword is used to indicate that a variable's value may be modified by
 * multiple threads. When a variable is declared as volatile, it ensures that updates to the
 * variable are immediately visible to all threads. This prevents threads from caching the variable
 * locally, forcing them to read it directly from main memory every time it’s accessed.
 */

class Task implements Runnable {

  private volatile boolean stop = false;

  @Override
  public void run() {
    while (!stop) {
      System.out.println("Task is running");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    System.out.println("Task is stopped");
  }

  public void stop() {
    stop = true;
  }

}

public class VolatileEx01 {

  public static void main(String[] args) throws InterruptedException {
    Task task = new Task();
    Thread thread = new Thread(task);
    thread.start();

    // Let the task run for a while
    Thread.sleep(2000);
    System.out.println("Requesting task to stop...");
    task.stop(); // Set stop to true, signaling the worker to stop

    thread.join(); // Wait for the worker thread to finish
    System.out.println("Worker thread has stopped.");
  }
}

/*
Without volatile
If stop were not declared as volatile, the thread might not see the change in stop for some time,
causing it to keep running and ignore the stop request.
This is because, without volatile, each thread can cache variables,
so updates made by one thread may not immediately reflect in other threads' caches.
 */
