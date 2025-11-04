package multithreading;

class Counter {
  int count = 0;

  void increment() {
    count++;
  }
}

// Fix race condition with synchronized keyword
class CounterSync {
  int count = 0;

  synchronized void increment() {
    count++;
  }
}

public class RaceConditionEx01 {
  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();
    CounterSync counterSync = new CounterSync();
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        counter.increment();
        counterSync.increment();
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        counter.increment();
        counterSync.increment();
      }
    });

    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println("count: " + counter.count); // ⚠️ Output might be less than 2000, because both threads modify count simultaneously.
    System.out.println("count from synchronized block: " + counterSync.count);
  }
}
