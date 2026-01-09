package common;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class SecondHighestInArray {

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10};
    System.out.println("findSecondHighest: " + findSecondHighest(arr));
    System.out.println("findThirdHighest: " + findThirdHighest(arr));
    System.out.println("findThirdHighest Using Java 8: " + findThirdHighestJava8(arr));

  }

  private static Map<String, Integer> findThirdHighest(int[] arr) {
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;
    int third = Integer.MIN_VALUE;

    for (int num : arr) {
      if (num > first) {
        third = second;
        second = first;
        first = num;
      } else if (num > second) {
        third = second;
        second = num;
      } else {
        third = num;
      }
    }

    return Map.of("first", first, "second", second, "third", third);

  }

  public static long findThirdHighestJava8(int[] arr) {

    return Arrays.stream(arr)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .skip(2)
        .findFirst()
        .orElse(Integer.MIN_VALUE);
  }

  public static int findSecondHighest(int[] arr) {
    int highest = Integer.MIN_VALUE;
    int secondHighest = Integer.MIN_VALUE;

    for (int i : arr) {
      if (i > highest) {
        secondHighest = highest;
        highest = i;
      } else if (i > secondHighest) {
        secondHighest = i;
      }
    }
    return secondHighest;
  }

}
