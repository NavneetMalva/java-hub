package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * MergeTwoArraysJava8.java
 * Created by Navneet Malva on 11/11/25 : 21:21.
 */
public class MergeTwoArraysJava8 {

  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>(Arrays.asList(13, 5, 27, 8, 42, 19, 33, 7, 21));
    List<Integer> numbers2 = new ArrayList<>(Arrays.asList(113, 115, 127, 118));
    List<String> words = new ArrayList<>(Arrays.asList("apple", "zebra", "java", "boot", "spring"));

    int[] arr1 = {1, 2, 3, 4};
    int[] arr2 = {5, 6, 7, 8};

    run(arr1, arr2);
    runIntegerList(numbers, numbers2);
  }


  private static void run(int[] arr1, int[] arr2) {
    int[] mergedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
    System.out.println(Arrays.toString(mergedArray));
  }

  private static void runIntegerList(List<Integer> numbers, List<Integer> numbers2) {
    System.out.println(
        Stream.concat(numbers.stream(), numbers2.stream()).toList()
    );
  }
}
