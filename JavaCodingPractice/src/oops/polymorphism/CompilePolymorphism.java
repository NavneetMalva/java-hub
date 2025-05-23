package oops.polymorphism;

/* It is also known as static polymorphism.
 * This type of polymorphism is achieved by function overloading or operator overloading.
 */

/*Java program for Method Overloading
by Using Different Numbers of Arguments
*/

//Class 1
//Helper class
class Helper {

  // Method 1
  // Multiplication of 2 numbers
  static int Multiply(int a, int b) {

    // Return product
    return a * b;
  }

  // Method 2
  // // Multiplication of 3 numbers
  static int Multiply(int a, int b, int c) {

    // Return product
    return a * b * c;
  }

  static double multiply(double a, double b) {
    return a * b;
  }
}

//Class 2
//Main class
class CompilePolymorphism {

  // Main driver method
  public static void main(String[] args) {

    // Calling method by passing
    // input as in arguments
    System.out.println(Helper.Multiply(2, 4));
    System.out.println(Helper.Multiply(2, 7, 3));
    System.out.println(Helper.multiply(5.5, 4.5));
  }
}
