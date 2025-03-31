package oops.inheritence;

/**
 * Java doesn't support multiple inheritance in classes But it does support the multiple inheritance
 * in interfaces.
 */
interface P1 {

}

interface P2 {

}

interface C extends P1, P2 {

  public static void main(String[] args) {
    System.out.println("hello");
  }
}
