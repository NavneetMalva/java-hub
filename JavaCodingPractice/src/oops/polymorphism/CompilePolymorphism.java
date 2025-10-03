package oops.polymorphism;

/* It is also known as static polymorphism.
 * This type of polymorphism is achieved by function overloading or operator overloading.
 */

/*Java program for Method Overloading by Using Different Numbers of Arguments
 */


class Helper {

  static int Multiply(int a, int b) {
    return a * b;
  }

  static int Multiply(int a, int b, int c) {
    return a * b * c;
  }

  static double multiply(double a, double b) {
    return a * b;
  }
}

class CompilePolymorphism {

  // Main driver method
  public static void main(String[] args) {

    System.out.println(Helper.Multiply(2, 4));
    System.out.println(Helper.Multiply(2, 7, 3));
    System.out.println(Helper.multiply(5.5, 4.5));
  }
}
