package multithreading;

// extends Threads -> class
// implements Runnable -> interface

class Task1 extends Thread {

  public void run() { // signature

    System.out.print("\nTask1 started");
    for (int i = 101; i < 199; i++) {
      System.out.print(i + " ");
    }
    System.out.print("\nTask1 done");
  }
}

class Task2 implements Runnable {

  @Override
  public void run() {
    System.out.print("\nTask2 started");
    for (int i = 201; i < 299; i++) {
      System.out.print(i + " ");
    }
    System.out.print("\nTask2 done");
  }

}

public class MultiThreadingBasics {

  public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub

    System.out.print("Task1 Kicked off");
    Task1 task1 = new Task1();
    task1.setPriority(
        10);  // priority is Just a request, doesn't mean it will always gets the priority
    task1.start(); // Its not task1.run() // with extends Thread

    System.out.print("\nTask2 Kicked off");
    Task2 task2 = new Task2();
    Thread task2Thread = new Thread(task2);  // with implements runnable
    task2Thread.start();

    // wait Task1 to get completed then run the Task3
    task1.join();
    // wait Task2 to get completed then run the Task3
    task2Thread.join();

    System.out.print("\nTask3 Kicked off");
    for (int i = 301; i < 399; i++) {
      System.out.print(i + " ");
    }
    System.out.print("\nTask3 done");

    System.out.print("\nMain done");

  }

}
