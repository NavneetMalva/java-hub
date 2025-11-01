package interview.infosys;

// what will be the value of Method A

import java.io.IOException;

public class ExceptionQ {

  public int methodA() {
    try {
      return 10;
    } catch (Exception e) {
      return 20;
    } finally {
      return 30;
    }
  }

  public static void main(String[] args) {
    ExceptionQ ex = new ExceptionQ();
    int a = ex.methodA();

    System.out.println(a);
  }

}

/**
 * Explanation: The try block returns 10. Normally, this would return from the method. If an
 * exception were thrown, the catch block would return 20. However, no exception occurs in this
 * case. The finally block always executes, and since it also contains a return statement (return
 * 30;), it overrides any previous return value from the try or catch block. // ans: 30
 */


class DemoException {
  private static int method1() {
    try {
      int a = 15 / 0;
      return 1;
    } catch (Exception e) {
      return 2;
    } finally {
      return 3;
    }
  }

  public static void main(String[] args) {
    int result = method1();
    System.out.println(result); // 3
  }
}

class DemoException2 {
  private static int method1() {
    try {
      int a = 15 / 0;
      return 1;
    } catch (Exception e) {
      throw new ArithmeticException(e.getMessage());
    } finally {
      return 3;
    }
  }

  public static void main(String[] args) {
    int result = method1();
    System.out.println(result); // 3 -> still the output will be 3, finally always gets executed
  }
}

/**
 * Question: What happens when you throw an exception from finally block?
 * Answer: When exception is thrown from finally block, then it takes
 * precedence over the exception that are thrown from try/catch block
 */

class MyException1 extends Exception {
}

class MyException2 extends Exception {
}

class MyCustomException {
  private static void method() throws Exception {
    try {
      System.out.println("5");
      throw new MyException1();
    } catch (MyException1 e) {
      System.out.println("6");
      throw new MyException2();
    } finally {
      System.out.println("7");
      throw new Exception();  // This OVERRIDES previous MyException2
    }
  }

  public static void main(String[] args) throws Exception {
    try {
      System.out.println("1");
      method();
      System.out.println("2");
    } catch (Exception e) {
      System.out.println("3");
      throw new MyException2();
    } finally {
      System.out.println("4");
      throw new MyException1();
    }
  }
}
/**
 * ❗ Final Exception Thrown: MyException1
 * ✅ Because:
 * method() threw Exception from finally, overriding previous exceptions.
 * Then main()’s finally block threw MyException1, overriding everything before it.
 */


/**
 * ✅ Yes, it WILL compile successfully.
 * <p>
 * 🧠 Why?
 * In Java, when you override a method, the overriding method in the subclass:
 * Must not throw broader (checked) exceptions than the method in the superclass.
 * Can:
 * Throw fewer or narrower checked exceptions, or
 * Throw unchecked exceptions (like RuntimeException and its subclasses), or
 * Throw no exception at all.
 */
class Exception1 {
  void method() throws Exception {
  }
}

class Exception2 extends Exception1 {
  void method() throws RuntimeException {
  }
}


class Exception11 {
  public void method() throws Exception {
    System.out.println("method from Super class");
  }
}

class Exception12 extends Exception11 {
  @Override
  public void method() throws IOException {
    System.out.println("method from subclass");
  }

  public static void main(String[] args) throws IOException {
    Exception12 exception12 = new Exception12();
    exception12.method();
  }
}

/**
 * if Parent class not throwing any exception
 * then, child class cannot throw checked exception
 */

class MyException3 {
  public void hello3() {
    System.out.println("hello from hello3");
  }
}

class MyException4 extends MyException3 {
  //public void hello3() throws IOException{    // ❌ Compile-time
  //  System.out.println("hello from hello4");
  //}
}

/**
 * When parent class method does not declare an exception and
 * child class declares unchecked exception.
 * ✅ Yes, it WILL compile successfully.
 */
class MyException5 extends MyException3 {
  @Override
  public void hello3() throws ArithmeticException {
    System.out.println();
  }
}


