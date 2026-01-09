package array;

import java.util.Arrays;

class RotateLeftArray {

  public static void main(String[] args) {
    //Initialize array
    int[] arr = new int[]{1, 2, 3, 4, 5};
    //number determine the number of times an array should be rotated
    int number = 3;

    System.out.println("Original array: " + Arrays.toString(arr));

    //Rotate the given array by number times toward left
    for (int i = 0; i < number; i++) {
      int j, first;
      //Stores the first element of the array
      first = arr[0];
      for (j = 0; j < arr.length - 1; j++) {
        //Shift element of array by one
        arr[j] = arr[j + 1];
      }
      //First element of array will be added to the end
      arr[j] = first;
    }

    //Displays resulting array after rotation
    System.out.println("Array after left rotation: ");
    for (int j : arr) {
      System.out.print(j + " ");
    }
  }
}