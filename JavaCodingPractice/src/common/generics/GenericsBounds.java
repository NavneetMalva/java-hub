package common.generics;

class GenericsBounds<T extends Number> {

  private T value;

  public GenericsBounds(T value) {
    this.value = value;
  }

  public void display() {
    System.out.println("Value: " + value);
  }

  public static void main(String[] args) {
    GenericsBounds<Integer> intObj = new GenericsBounds<>(123);
    intObj.display();  // Output: Value: 123

    GenericsBounds<Double> doubleObj = new GenericsBounds<>(45.67);
    doubleObj.display();  // Output: Value: 45.67

    // The following will cause a compile-time error because String does not extend Number
    // GenericClass<String> strObj = new GenericClass<>("Hello");
  }

}

