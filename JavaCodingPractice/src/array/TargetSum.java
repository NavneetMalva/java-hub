package array;

import java.util.HashSet;
import java.util.Set;

class TargetSum {

  public static boolean hasTargetSum(int[] arr, int target) {
    Set<Integer> seenNumbers = new HashSet<>();

    for (int num : arr) {
      if (seenNumbers.contains(target - num)) {
        System.out.println("Numbers found: " + num + " and " + (target - num));
        return true;
      } else {
        seenNumbers.add(num);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = {30, 10, 20, 30, 40};
    int target = 50;

    if (hasTargetSum(arr, target)) {
      System.out.println("Target sum exists!");
    } else {
      System.out.println("Target sum does not exist!");
    }

  }
}
