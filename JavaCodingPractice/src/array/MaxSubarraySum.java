package array;

public class MaxSubarraySum {

  public static void main(String[] args) {
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;

    for (int num : nums) {
      currSum += num;
      if (currSum > maxSum) {
        maxSum = currSum;
      }
      if (currSum < 0) {
        currSum = 0;
      }
    }
    System.out.println("maximum sum of the subarray: " + maxSum);
  }

}
