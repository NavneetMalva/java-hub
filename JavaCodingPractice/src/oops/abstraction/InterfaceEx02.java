package oops.abstraction;

interface Passport {

  void apply();

  void appointment();

  void verification();
}

// if not abstract class, then need to implement all the abstract methods
abstract class User1 implements Passport {

  @Override
  public void apply() {
    System.out.println("User applied");
  }
}

abstract class User2 extends User1 {

  public void appointment() {
    System.out.println("User appointment");
  }
}

// now User3 class have all the abstract methods
class User3 extends User2 {

  public void verification() {
    System.out.println("User verification");
  }
}

// Not have all the abstract methods
// since its abstract class , we can not instantiated in main class
abstract class User4 extends User1 {

  public void appointment() {
    System.out.println("User appointment doing it again");
  }
}

public class InterfaceEx02 {

  public static void main(String[] args) {
    User3 user3 = new User3();
    user3.apply();
    user3.appointment();
    user3.verification();

    // User4 user4 = new User4(); // will throw error

  }
}

