package info;

@FunctionalInterface
interface myFunctionalInterface {

  void methodA();

  default void defaultMethod() {
    System.out.println("default method");
  }

}

/**
 * Use case of default method Default methods solve this problem by allowing new methods to be added
 * to interfaces with default behavior, so existing classes don't need to implement them unless
 * desired.
 */

public class DefaultMethodQ implements myFunctionalInterface {

  public void methodA() {
    System.out.println("methodA");
  }

  public static void main(String[] args) {
    DefaultMethodQ obj = new DefaultMethodQ();
    obj.methodA();
    obj.defaultMethod();
  }
}
