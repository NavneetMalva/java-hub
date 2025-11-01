package sorting;

public class MergeSort {

  public static void merge(int[] arr, int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;

    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; i++) {
      L[i] = arr[l + i];
    }
    for (int j = 0; j < n2; j++) {
      R[j] = arr[m + 1 + j];
    }

    // merging the two arrays
    int i = 0, j = 0;
    int k = l;

    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    // copy remaining elements
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
    }
  }

  // Main function that sorts arr[l..r] using merge()
  static void mergeSort(int[] arr, int l, int r) {

    if (l < r) {
      // Find the middle point
      int m = l + (r - l) / 2;

      // Sort first and second halves
      mergeSort(arr, l, m);
      mergeSort(arr, m + 1, r);

      // Merge the sorted halves
      merge(arr, l, m, r);
    }
  }

  public static void main(String[] args) {

    int[] arr = {38, 27, 43, 10};

    mergeSort(arr, 0, arr.length - 1);

    int n = arr.length;
    for (int j : arr) System.out.print(j + " ");
    System.out.println();
  }


}
