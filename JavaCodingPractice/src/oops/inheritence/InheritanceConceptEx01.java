package oops.inheritence;

class Parent {

  public void m1() {
    System.out.println("Parent m1 method");
  }
}

class Child extends Parent {

  public void m1() {
    System.out.println("Child m1 method");
  }

  public void m2() {
    System.out.println("Child m2 method");
  }
}

class InheritanceConcept {

  public static void main(String[] args) {
    Parent p = new Parent();
    p.m1();
    // p.m2(); // ERROR : can not call child method from Parent class

    Child c = new Child();
    c.m1();
    c.m2();

    Parent c2 = new Child();  // Parent reference can be use to hold the child class reference
    c2.m1();
    // c2.m2(); // ERROR : but from Parent reference, we can not call child specific methods

  }
}
