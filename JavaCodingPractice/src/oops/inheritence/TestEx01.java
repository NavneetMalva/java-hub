package oops.inheritence;

class Base {

  public Base() {
    System.out.println("Base");
  }
}

class Derived extends Base {

  public Derived() {
    System.out.println("Derived");
  }
}

class DeriDerived extends Derived {

  public DeriDerived() {
    System.out.println("DeriDerived");
  }
}

public class TestEx01 {

  public static void main(String[] args) {
    Derived b = new DeriDerived();
  }
}