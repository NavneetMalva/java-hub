package common;

public class SecondHighestInArray {

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println("findSecondHighest: " + findSecondHighest(arr));

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
