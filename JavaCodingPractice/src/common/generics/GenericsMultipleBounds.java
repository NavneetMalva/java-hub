package common.generics;

interface Printable {

  void print();
}

class MyNumber extends Number implements Printable {

  private final int value;

  public MyNumber(int value) {
    this.value = value;
  }

  @Override
  public void print() {
    System.out.println("MyNumber: " + value);
  }

  @Override
  public int intValue() {
    return value;
  }

  @Override
  public long longValue() {
    return value;
  }

  @Override
  public float floatValue() {
    return value;
  }

  @Override
  public double doubleValue() {
    return value;
  }
}

class Boxx<T extends Number & Printable> {

  private T item;

  public Boxx(T item) {
    this.item = item;
  }

  public void display() {
    item.print();
  }

  public T getItem() {
    return item;
  }
}

public class GenericsMultipleBounds {

  public static void main(String[] args) {
    MyNumber myNumber = new MyNumber(12);
    Boxx<MyNumber> box = new Boxx<>(myNumber);
    box.display();
  }
}

/**
 * The Box class can only work with objects that are both a subclass of Number and implement the
 * Printable interface. This ensures that the objects it handles are numeric and can also be
 * printed.
 * <p>
 * The correct order is to place the class first, followed by the interfaces: <T extends Animal &
 * Runnable>
 */
