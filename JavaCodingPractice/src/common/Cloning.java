package common;

/**
 * Cloning with the clone() Method The clone() method in Java is defined in the Object class and is
 * used to create a copy of an object. For an object to be cloned: The class of the object must
 * implement the Cloneable interface. The clone() method should be overridden and made public in the
 * class because it is protected in Object.
 */

class EmpOriginal implements Cloneable {

  private String name;
  private int age;

  public EmpOriginal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return "EmpOriginal [name=" + name + ", age=" + age + "]";
  }

  @Override
  public EmpOriginal clone() throws CloneNotSupportedException {
    return (EmpOriginal) super.clone();
  }
}

public class Cloning {

  public static void main(String[] args) throws CloneNotSupportedException {
    EmpOriginal emp = new EmpOriginal("John Doe", 23);
    EmpOriginal empClone = emp.clone();
    System.out.println("empClone: " + empClone);
  }
}
