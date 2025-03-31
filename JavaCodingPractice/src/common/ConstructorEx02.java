package common;

public class ConstructorEx02 {

  public String str;

  public ConstructorEx02() {
    System.out.println("Non-parameterized Constructor");
  }

  public ConstructorEx02(String str) {
    System.out.println("parameterized Constructor with String value " + str);
  }

  public static void main(String[] args) {

    ConstructorEx02 construct1 = new ConstructorEx02();
    ConstructorEx02 construct2 = new ConstructorEx02("Hello World.");

  }


}
