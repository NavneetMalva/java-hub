package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExampleEx01 {
  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(3);

    for (int i = 0; i < 5; i++) {
      int taskId = i;
      executor.submit(() -> {
        System.out.println("Running Task " + taskId + " in " + Thread.currentThread().getName());
      });
    }
    executor.shutdown();
  }
}
