package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSum {

  public static List<int[]> pairSum(int[] arr, int s) {
    // Write your code here.
    List<int[]> list = new ArrayList<>();
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == s) {
          int[] pair = new int[2];
          pair[0] = arr[i];
          pair[1] = arr[j];
          list.add(pair);
        }
      }
    }
    return list;
  }

  public static List<int[]> pairSumUsingTwoPoint(int[] arr, int s) {
    List<int[]> result = new ArrayList<>();
    int left = 0, right = arr.length - 1;
    while (left < right) {
      int sum = arr[left] + arr[right];
      if (sum == s) {
        result.add(new int[]{arr[left], arr[right]});
        left++;
        right--;
      } else if (sum < s) left++;
      else right--;
    }
    return result;
  }

  public static void main(String[] args) {

    int[] arr = {1, 5, 2, 4, 3, 6};
    Arrays.sort(arr);
    List<int[]> result = pairSum(arr, 5);
    for (int[] elementpair : result) {
      System.out.println(Arrays.toString(elementpair));
    }

    System.out.println("pairSumUsingTwoPoint");
    List<int[]> res = pairSumUsingTwoPoint(arr, 5);
    for (int[] element : res) {
      System.out.print(Arrays.toString(element));
    }
  }


}
