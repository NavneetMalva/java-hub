package interview;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product
 * of all the elements of nums except nums[i].
 * Rules:
 * - Must run in O(n) time
 * - No division allowed
 */
public class MultiplicationOfNumbers {

  public static void main(String[] args) {

    int[] arr = new int[]{1, 2, 3, 4};

    int[] res = calculateProduct(arr);
    for (int i : res) {
      System.out.print(i + " ");
    }

  }

  private static int[] calculateProduct(int[] arr) {

    int l = arr.length;
    int[] res = new int[l];

    res[0] = 1;
    // product of left numbers
    for (int i = 1; i < l; i++) {
      res[i] = res[i - 1] * arr[i - 1];
    }

    int rightproduct = 1;
    for (int i = l - 1; i >= 0; i--) {
      res[i] = res[i] * rightproduct;
      rightproduct *= arr[i];
    }

    return res;
  }
}
