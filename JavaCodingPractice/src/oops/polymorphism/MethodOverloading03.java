package oops.polymorphism;

class MethodOverloading05 {

  public void m1(int i, float f) {
    System.out.println("int-float method");
  }

  public void m1(float f, int i) {
    System.out.println("float-int method");
  }

  public static void main(String[] args) {
    MethodOverloading05 ml = new MethodOverloading05();
    ml.m1(100, 15.5f);  // i-f
    ml.m1(10f, 10); // f-i
    // ml.m1(10,10); // ERROR : m1 is ambiguous.
    // byte → short → int → long → float → double
    // ml.m1(20.5f,20.5f); // ERROR: no suitable method found for m1
  }
}
