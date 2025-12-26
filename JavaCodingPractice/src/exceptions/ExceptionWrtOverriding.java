package exceptions;

class Parent {
  void method1() {
    System.out.println("Parent: No exception declared");
  }

  void method2() throws Exception {
    System.out.println("Parent: Declares Exception");
  }
}

class Child extends Parent {

  // ✅ Allowed: No exception in parent → child declares unchecked exception
  @Override
  void method1() throws RuntimeException {
    System.out.println("Child: Declares unchecked exception");
  }

  // ✅ Allowed: Parent declares checked Exception → child declares no exception
  @Override
  void method2() {
    System.out.println("Child: Declares no exception");
  }

    /*
    // ❌ Not Allowed: Parent declares no exception → child declares checked exception
    @Override
    void method1() throws IOException {
        System.out.println("Invalid: Checked exception not allowed");
    }
    */

    /*
    // ❌ Not Allowed: Parent declares Exception → child declares broader exception like Throwable
    @Override
    void method2() throws Throwable {
        System.out.println("Invalid: Broader exception not allowed");
    }
    */

    /*
    // ✅ Allowed: Parent declares Exception → child declares narrower exception like IOException
    @Override
    void method2() throws IOException {
        System.out.println("Valid: Narrower exception allowed");
    }
    */
}

/*Executing finally
Exception in thread "main" java.lang.ArithmeticException: / by zero
- Exception is thrown after finally completes
*/
class ExceptionWithFinally {
  public static void main(String[] args) {
    try {
      int x = 10 / 0;
    } finally {
      System.out.println("Executing finally");
    }
  }
}

/*
finally runs
But since no return in finally, return from catch stands
*/
class ExceptionWithFinallyReturn {
  public static void main(String[] args) {
    System.out.println(finallyWithReturn());
  }

  private static int finallyWithReturn() {
    try {
      int x = 10 / 0;
    } catch (Exception e) {
      return 1;
    } finally {
      System.out.println("Executing finally");
    }
    return 2;
  }
}

public class ExceptionWrtOverriding {
  public static void main(String[] args) {
    Parent obj = new Child();
    obj.method1();
    try {
      obj.method2();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


