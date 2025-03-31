package common;

public class ThisExample {

  int a = 10;
  static int b = 20;

  void print() {
    this.a = 99;
    this.b = 111;
    System.out.println(a + " " + b);
  }

  public static void main(String[] args) {
    new ThisExample().print(); // 99 111
  }
}
