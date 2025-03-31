package common.generics;

public class GenericMethod {

  public static void main(String[] args) {
    Integer[] intArr = {1, 2, 3, 7, 3};
    String[] strArr = {"hello", "world"};
    printArray(intArr);
    printArray(strArr);

  }

  public static <T> void printArray(T[] arr) {
    for (T element : arr) {
      System.out.print(element + " ");
    }
    System.out.println();
  }
}
