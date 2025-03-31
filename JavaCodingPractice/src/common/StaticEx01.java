package common;

/*
 * Static keyword can be used with class, variable, method and block. 
Static members belong to the class instead of a specific instance, 
this means if you make a member static, you can access it without object.
*/

public class StaticEx01 {

  static void myStaticMethod() {
    System.out.println("My static method");
  }

  static int a = 10;
  static String s = "Rick";

  int nonstaticVar1 = 100;

  static int num;
  static String str;

  // static block
  static {
    num = 100;
    str = "This is a static String";
  }

  // another static method
  static void display() {
    System.out.println("printing the static varibles : " + "\n" + num + " and " + str);
  }

  public static void main(String[] args) {

    /*
     * You can see that we are calling this method without creating any object.
     */
    myStaticMethod();

    System.out.println("static variables : " + a + " " + s);
    // System.out.println("nonstaticVar1:"+ nonstaticVar1); // will throw error.

    display();

  }

}
