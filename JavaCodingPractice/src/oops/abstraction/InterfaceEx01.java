package oops.abstraction;

/**
 * The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods
 * in the Java interface, not method body. It is used to achieve abstraction and multiple
 * inheritance in Java.
 * <p>
 * In other words, you can say that interfaces can have abstract methods and variables. It cannot
 * have a method body.
 * <p>
 * Since Java 8, we can have default and static methods in an interface.
 * <p>
 * Since Java 9, we can have private methods in an interface.
 */

interface Drawable {

  void draw(); // abstract method

  default void msg() {
    System.out.println("default method");
  } // default method

  static int cube(int x) {
    return x * x * x;
  } // static method, belongs to the class rather than instance
}

class Rectangles implements Drawable {

  public void draw() {
    System.out.println("drawing rectangle");
  }
}

public class InterfaceEx01 {

  public static void main(String[] args) {
    Rectangles r = new Rectangles();
    r.draw();
    r.msg();

    System.out.println(Drawable.cube(10));


  }
}
