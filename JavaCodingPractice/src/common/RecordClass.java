package common;

/**
 * Record.java
 * Created by Navneet Malva on 13/01/26 : 14:38.
 * <p>
 * Record classes in Java are a special type of class designed to create concise,
 * immutable data carriers with minimal boilerplate code.
 * Introduced as a final feature in Java 16 (JEP 395),
 * they eliminate the need to manually write constructors, accessor methods (getters), equals(), hashCode(), and toString() methods.
 */
public record RecordClass(String firstName, String lastName) {
}

class RecordClassDemo {
  public static void main(String[] args) {

    RecordClass recordClass = new RecordClass("John", "Smith");
    System.out.println(recordClass.firstName());
    System.out.println(recordClass.lastName());

  }
}
