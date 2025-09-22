package multithreading;

/*
Here, these 2 threads will block each other, as only one lock per class exists.
So, these 2 static synchronized methods will not be executed at the same time.

| Scenario                                                                | Will methods block each other?  |
| ----------------------------------------------------------------------- | ------------------------------- |
| Two threads calling synchronized static methods [Given Example]         | ✅ Yes, lock on class object     |
| Two threads calling synchronized instance methods (same instance)       | ✅ Yes, lock on the instance     |
| Two threads calling synchronized instance methods (different instances) | ❌ No, they run in parallel      |
| One static and one instance method                                      | ❌ No, lock on different objects |
| Using separate locks in static methods                                  | ❌ No, can run concurrently      |

*/

class Demo {

  public static synchronized void m1() {
    System.out.println("inside m1");
    for (int i = 1; i <= 5; i++) {
      System.out.println(Thread.currentThread().getName() + ", i: " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static synchronized void m2() {
    System.out.println("inside m2");
    for (int i = 1; i <= 5; i++) {
      System.out.println(Thread.currentThread().getName() + ", j: " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}

public class StaticSynchronizedEx {
  public static void main(String[] args) {

    Thread t1 = new Thread(() -> Demo.m1());
    t1.setName("First Thread");

    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        Demo.m2();
      }
    });
    t2.setName("Second Thread");

    t1.start();
    t2.start();
  }
}
