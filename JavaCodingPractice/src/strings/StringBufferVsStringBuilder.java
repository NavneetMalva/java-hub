package strings;

public class StringBufferVsStringBuilder {

  public static void main(String[] args) throws InterruptedException {
    // StringBuffer Example
    StringBuffer stringBuffer = new StringBuffer("Hello");
    stringBuffer.append(" World");
    System.out.println("StringBuffer result: " + stringBuffer);

    // StringBuilder Example
    StringBuilder stringBuilder = new StringBuilder("Hello");
    stringBuilder.append(" World");
    System.out.println("StringBuilder result: " + stringBuilder);

    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 100; i++) {
        stringBuffer.append(" T" + i);
        stringBuilder.append(" S" + i); // comment this
      }
      System.out.println("StringBuffer after thread 1: " + stringBuffer);
      System.out.println("StringBuilder after thread 1: " + stringBuilder);
    });

    Thread thread2 = new Thread(() -> {
      for (int i = 0; i < 100; i++) {
        stringBuffer.append(" T" + i);
        stringBuilder.append(" S" + i);  // comment this
      }
      System.out.println("StringBuffer after thread 2: " + stringBuffer);
      System.out.println("StringBuilder after thread 2: " + stringBuilder);
    });

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    // Demonstrating single-threaded modification for StringBuilder
    for (int i = 0; i < 10; i++) {
      stringBuilder.append(" S" + i);
    }
    System.out.println("StringBuilder after single-threaded modification: " + stringBuilder);

  }
}

/**
 * Its possible to get corrupted output for StringBuilder like this if we re-run multiple times in
 * Thread, Since stringBuilder is not synchronized. StringBuilder after thread 1: Hello World S0 S0
 * S1    S2 S2 S3 .....
 */