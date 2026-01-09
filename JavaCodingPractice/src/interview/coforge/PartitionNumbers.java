package interview.coforge;

import java.util.Arrays;

/**
 * PartitionNumbers.java
 * Created by Navneet Malva on 09/01/26 : 19:38.
 */
public class PartitionNumbers {
  public static void main(String[] args) {
    int[] arr = {5, -1, 3, -7, -2, 4, 8, -9};

    System.out.println("Original Array: " + Arrays.toString(arr));
    stablePartition(arr);
    System.out.println("Partitioned Array: " + Arrays.toString(arr));
  }

  static void stablePartition(int[] arr) {
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
}
