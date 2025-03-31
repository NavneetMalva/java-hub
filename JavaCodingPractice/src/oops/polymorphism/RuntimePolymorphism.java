package oops.polymorphism;

/* It is a process in which a function call to the overridden method is resolved at Runtime.
 * This type of polymorphism is achieved by Method Overriding
 */
class Parent {

  public void printMessage() {
    System.out.println("Parent class method");
  }
}

class Subclass1 extends Parent {

  public void printMessage() {
    System.out.println("Subclass1 method");
  }
}

class Subclass2 extends Parent {

  public void printMessage() {
    System.out.println("Subclass2 method");
  }
}

public class RuntimePolymorphism {

  public static void main(String[] args) {

    Parent sub1 = new Subclass1();
    Parent sub2 = new Subclass2();
    sub1.printMessage();
    sub2.printMessage();

    Parent p = new Parent();
    p.printMessage();

  }

}
