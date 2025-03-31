package oops.abstraction;


abstract class Test {

  public abstract void m1();

  public abstract void m2();
}

// since SubTest class doesn't provide the implementation for both the methods, hence abstract class.
abstract class SubTest extends Test {

  public void m1() {
    System.out.println("m1 method");
  }
}

class SubSubTest extends SubTest {

  public void m2() {
    System.out.println("m2 method");
  }
}

class AbstractClass {

  public static void main(String[] args) {
    SubSubTest sst = new SubSubTest();
    sst.m1();
  }
}
