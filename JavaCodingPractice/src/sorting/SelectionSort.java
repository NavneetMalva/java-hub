package sorting;
/*
📘 Concept
Divides the array into sorted and unsorted parts.
Repeatedly selects the smallest element from the unsorted part and places it at the beginning.
*/

public class SelectionSort {

  private static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[minIndex] > arr[j]) {
          minIndex = j;
        }
      }

      int tmp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = tmp;


    }

  }

  public static void main(String[] args) {
    int[] arr = {4, 1, 5, 11, 7};
    selectionSort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

}
