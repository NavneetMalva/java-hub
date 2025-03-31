package array;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintArrayElements {

  public static void main(String[] args) {

    String[] strArr = {"One", "Two", "Three"};
    // Method 1
    Arrays.asList(strArr).forEach(element -> System.out.println(element));

    // Method 2
    Arrays.stream(strArr).forEach(System.out::println);

    // Method 3
    Stream.of(strArr).forEach(e -> System.out.println(e));

    System.out.println("*** Method 4");
    for (int i = 0; i < strArr.length; i++) {
      System.out.println(strArr[i]);
    }

    System.out.println("*** Method 5");
    for (String element : strArr) {
      System.out.println(element);
    }

    System.out.println("*** Method 6");
    System.out.println(Arrays.toString(strArr));

    System.out.println("*** Method 7");
    String result = Arrays.stream(strArr).collect(Collectors.joining(","));
    System.out.println(result);


  }

}
