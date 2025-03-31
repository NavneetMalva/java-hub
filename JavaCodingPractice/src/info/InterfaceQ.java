package info;

interface myInterface {

  static void methodB() {
    System.out.println("static methodB");
  }
}

// since myInterface has static method, when we will implement this in class
// methodB won't  get implemented in class.
// so this code will compile fine, even though class doesn't have methodB

public class InterfaceQ implements myInterface {

  public static void main(String[] args) {
    InterfaceQ obj = new InterfaceQ();

  }
}
