package oops.polymorphism;


class Parents {

  public void m1() {
    System.out.println("method m1 parent");
  }

  public void m2() {
    System.out.println("method m2 parent");
  }
}

class Childs extends Parents {

  @Override
  public void m2() {
    System.out.println("method m2 child");
  }
}

class MethodOverriding01 {

  public static void main(String[] args) {
    Parents p = new Parents();
    p.m2(); // m2 parent

    Childs c = new Childs();
    c.m2(); // m2 child

    Parents c2 = new Childs();
    c2.m2(); // m2 child

    /**
     * Parent can hold the child reference.
     *  m2 method is Present is Parent as well
     *  In overriding, method resolution happens at run time by JVM , that why it will call Child method
     *  and that's the reason, it is also Runtime Polymorphism.
     */
  }
}
