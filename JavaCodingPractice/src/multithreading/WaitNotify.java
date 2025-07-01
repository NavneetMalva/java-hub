package multithreading;

class SharedResource {
  private boolean isReady = false;

  public synchronized void waitForSignal() {
    System.out.println("Waiting for signal...");
    while (!isReady) {
      try {
        wait(); // Wait until notified
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    System.out.println("Received signal!");
  }

  public synchronized void sendSignal() {
    isReady = true;
    notify(); // Send signal to waiting thread
    System.out.println("Signal sent!");
  }
}

public class WaitNotify {
  public static void main(String[] args) {
    SharedResource resource = new SharedResource();

    // Thread 1 - waits for signal
    Thread waitingThread = new Thread(resource::waitForSignal);

    // Thread 2 - sends signal after 2 seconds
    Thread notifyingThread = new Thread(() -> {
      try {
        Thread.sleep(2000); // Delay to simulate work
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      resource.sendSignal();
    });

    waitingThread.start();
    notifyingThread.start();
  }
}
