package array;

import java.util.Arrays;

public class ReverseSubArray {

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6, 7};

    // after which position we want to reverse the array
    int m = 3;

    int start = m + 1;
    int end = arr.length - 1;

    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    System.out.println(Arrays.toString(arr));
  }

}
