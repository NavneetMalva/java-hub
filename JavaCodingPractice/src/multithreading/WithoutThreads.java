package multithreading;

public class WithoutThreads {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("Task1 started");
    for (int i = 101; i < 199; i++) {
      System.out.print(i + " ");
    }
    System.out.print("\nTask1 done");

    System.out.println("\nTask2 started");
    for (int i = 201; i < 299; i++) {
      System.out.print(i + " ");
    }
    System.out.print("\nTask2 done");

    System.out.println("\nTask3 started");
    for (int i = 301; i < 399; i++) {
      System.out.print(i + " ");
    }
    System.out.print("\nTask3 done");

    System.out.println("\nMain done");

  }

}
