package common.generics;

/**
 * A generic type is a class or interface that is parameterized over types. For example, a generic
 * class can work with any type specified by the user, and that type can be enforced at compile
 * time.
 */

public class Box<T> {

  private T value;

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public static void main(String[] args) {
    Box box = new Box();
    box.setValue(1);
    //String value1 = (String) box.getValue(); //ClassCastException on RunTime
    //System.out.println(value1);

    Box<String> box1 = new Box<>(); // Box is type-safe now
    box1.setValue("One Box");
    String value2 = box1.getValue(); //No type-casting needed
    System.out.println(value2);

    Box<Integer> box3 = new Box<>(); // Box is type-safe now
    box3.setValue(69);
    Integer value3 = box3.getValue();
    System.out.println(value3);

  }
}
