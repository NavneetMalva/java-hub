package sorting;
/*
📘 Concept
Compares adjacent elements and swaps them if they’re in the wrong order.
Each pass "bubbles" the largest element to the end.
*/

public class BubbleSort {

  public static void bubbleSort(int[] arr) {

    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
        }
      }
    }

  }

  public static void main(String[] args) {
    int[] arr = {4, 1, 5, 11, 7};
    bubbleSort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

}
