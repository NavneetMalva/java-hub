package interview.vaco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class PracticeQuestions {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a string to check: ");
    String str = scan.nextLine();
    scan.close();

    List<Integer> list = new ArrayList<>(List.of(1, 4, 2, 3, 5, 6));
    int[] arr = {0, 1, 0, 3, 12};

    System.out.println("The string is a palindrome or not: " + checkPalindrome(str));
    System.out.println("The first non-repeating character is: " + nonRepeatingChar(str));
    System.out.println("Triplets of an array:" + findTriplets(list));
    System.out.println("Move Zero at the end:");
    moveZerosAtEnd(arr);
    for (int num : arr) System.out.print(num + " ");

    System.out.print("\nRotated array:");
    int[] roArr = {1, 2, 3, 4, 5, 6};
    rotate(roArr, 2);
    for (int num : roArr) System.out.print(num + " ");

    System.out.println("Maximum for a subArray:" + maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }


  public static Boolean checkPalindrome(String str) {
    String rev = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      rev = rev + str.charAt(i);
    }
    return str.equals(rev);
  }

  public static Character nonRepeatingChar(String str) {
    LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1) {
        return entry.getKey();
      }
    }
    return null;
  }

  private static List<List<Integer>> findTriplets(List<Integer> list) {
    List<List<Integer>> result = new ArrayList<>();

    Collections.sort(list);
    Set<Integer> set = new HashSet<>(list);

    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        int sum = list.get(i) + list.get(j);
        if (set.contains(sum)) {
          result.add(Arrays.asList(list.get(i), list.get(j), sum));
        }
      }
    }

    return result;
  }

  public static void moveZerosAtEnd(int[] arr) {
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
        j++;
      }
    }
  }

  public static void reverse(int[] arr, int l, int r) {
    while (l < r) {
      int tmp = arr[l];
      arr[l++] = arr[r];
      arr[r--] = tmp;
    }
  }

  public static void rotate(int[] arr, int k) {
    k = k % arr.length;
    reverse(arr, 0, arr.length - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, arr.length - 1);
  }

  public static int maxSubArray(int[] arr) {
    int currMax = 0;
    int totalMax = 0;
    for (int i = 0; i < arr.length; i++) {
      currMax = Math.max(arr[i], currMax + arr[i]);
      totalMax = Math.max(currMax, totalMax);
    }
    return totalMax;
  }

}
