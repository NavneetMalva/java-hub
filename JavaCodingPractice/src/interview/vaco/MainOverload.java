package interview.vaco;

/*Yes ✅ — the main() method can be overloaded in Java.
However, only the standard signature is used by the JVM as the program’s entry point.
Other overloaded versions can exist but won’t be called automatically — you must call them manually.
 */
public class MainOverload {
  // Standard main method — entry point
  public static void main(String[] args) {
    System.out.println("Inside main(String[] args)");

    // Calling overloaded versions manually
    main(10);
    main("Hello");
  }

  public static void main(int num) {
    System.out.println("Inside main(int): " + num);
  }

  public static void main(String str) {
    System.out.println("Inside main(String): " + str);
  }
}

