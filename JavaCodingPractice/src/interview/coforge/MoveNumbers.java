package interview.coforge;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * PartitionNumbers.java
 * Created by Navneet Malva on 09/01/26 : 19:38.
 */
public class MoveNumbers {
  public static void main(String[] args) {
    int[] arr = {5, -1, 3, -7, -2, 4, 8, -9};
    int[] arr2 = arr.clone();


    System.out.println("Original Array: " + Arrays.toString(arr));
    moveNegativeUsingJava8(arr);

    movePositiveLeft(arr);
    System.out.println("Partitioned Array: " + Arrays.toString(arr));
    moveNegativeLeft(arr2);
    System.out.println("Moved Negative numbers left: " + Arrays.toString(arr2));
  }

  static void movePositiveLeft(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      // if current is positive, continue as they should be on left
      if (arr[i] >= 0) continue;

      // If negative found, find next positive after it
      int j = i + 1;
      while (j < n && arr[j] < 0) {
        j++;
      }

      if (j == n) return; // no more positives

      // Now arr[j] is positive, rotate segment [i...j]
      int temp = arr[j];
      while (j > i) {
        arr[j] = arr[j - 1];
        j--;
      }
      arr[i] = temp;
    }
  }

  static void moveNegativeLeft(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      // if number is negative, continue as that should be in left
      if (arr[i] < 0) continue;

      int j = i + 1;
      while (j < n && arr[j] >= 0) {
        j++;
      }
      if (j == n) return;

      int temp = arr[j];
      while (j > i) {
        arr[j] = arr[j - 1];
        j--;
      }
      arr[j] = temp;

    }
  }


  static void moveNegativeUsingJava8(int[] arr) {

    int[] array = IntStream.concat(
        Arrays.stream(arr).filter(n -> n < 0),
        Arrays.stream(arr).filter(n -> n >= 0)
    ).toArray();

    System.out.println("Move negative elements to left using Java8: " + Arrays.toString(array));

  }
}
