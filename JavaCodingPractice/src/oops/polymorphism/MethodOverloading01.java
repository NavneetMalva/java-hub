package oops.polymorphism;

/**
 * Why it works: Method overloading resolution happens at compile-time, and the compiler selects the
 * best match for the method based on the argument type. If an exact match is unavailable, widening
 * is used. Widening conversion in Java allows a smaller primitive type to be converted to a larger
 * one in the following order: byte → short → int → long → float → double
 * <p>
 * For 'a' (a char), it widens to int. For 10L (a long), it widens to float.
 */
class MethodOverloading01 {

  public void m1(int i) {
    System.out.println("int arg method");
  }

  public void m1(float f) {
    System.out.println("float arg method");
  }

  public static void main(String[] args) {
    MethodOverloading01 ml = new MethodOverloading01();
    ml.m1(10); // int
    ml.m1(10.5F); // float
    ml.m1('a'); // int
    ml.m1(10L); // float
    // ml.m1(10.5);  // ERROR : double can't be promoted here.
  }
}
