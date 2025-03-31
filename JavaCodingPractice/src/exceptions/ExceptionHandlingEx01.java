package exceptions;

public class ExceptionHandlingEx01 {

  public static void main(String[] args) {

    try {
      int a = 1 / 0;
      System.out.println("Value of a: " + a);
    } catch (ArithmeticException ex) {
      ex.printStackTrace();
    } catch (Exception e) {  //exception class must be last class to handle exception
      System.out.println(e);
    } finally {
      System.out.println("Finally block.");
    }

  }

}
