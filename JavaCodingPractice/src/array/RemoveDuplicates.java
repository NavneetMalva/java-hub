package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

  public static void main(String[] args) {

    Integer[] numbers = {1, 2, 3, 1, 2, 4, 5};

    Set<Integer> hs = new HashSet<>(Arrays.asList(numbers));

    System.out.println("Array after duplication removed: " + hs); // [1, 2, 3, 4, 5]

    Integer[] result = hs.toArray(new Integer[0]);
    System.out.println(
        "Array after duplication removed: " + Arrays.toString(result)); // [1, 2, 3, 4, 5]

  }

}
