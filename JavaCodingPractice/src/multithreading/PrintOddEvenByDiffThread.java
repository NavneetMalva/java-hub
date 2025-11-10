package multithreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// print odd numbers by one thread and even numbers by one thread using Executor service
public class PrintOddEvenByDiffThread {

  private static final Object lock = new Object();
  private static int number = 1;
  private static boolean isOddTurn = true;

  public static void main(String[] args) {

    ExecutorService executorService = Executors.newFixedThreadPool(2);

    Runnable printOdd = () -> {
      while (number < 100) {
        synchronized (lock) {
          while (!isOddTurn) {
            try {
              lock.wait();
            } catch (InterruptedException e) {
              throw new RuntimeException(e);
            }
          }
          if (number <= 100) {
            System.out.println("Odd Thread-> " + Thread.currentThread().getName() + ": " + number);
            number++;
            isOddTurn = false;
            lock.notifyAll();
          }
        }
      }

    };

    Runnable printEven = () -> {

      while (number < 100) {
        synchronized (lock) {
          while (isOddTurn) {
            try {
              lock.wait();
            } catch (InterruptedException e) {
              throw new RuntimeException(e);
            }
          }
          if (number <= 100) {
            System.out.println("Even Thread: " + Thread.currentThread().getName() + " " + number);
            number++;
            isOddTurn = true;
            lock.notifyAll();
          }
        }
      }

    };

    executorService.submit(printOdd);
    executorService.submit(printEven);

    executorService.shutdown();
  }
}
