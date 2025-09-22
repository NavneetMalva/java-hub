package common;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class FindHCF {
  public static void main(String[] args) {
    int n1 = 12;
    int n2 = 8;
    //int res = findHcfByDiv(n1, n2);
    //System.out.println(res);
    //
    //System.out.println(findHcfByAlgo(12, 48));
    //
    //System.out.println(makeString());
    System.out.println(findProfit());
    System.out.println(findProfitSimple());
  }

  private static int findHcfByDiv(int n1, int n2) {
    int res = 1;
    for (int i = 1; i <= Math.min(n1, n2) / 2; i++) {
      if (n1 % i == 0 && n2 % i == 0) {
        res = i;
      }
    }
    return res;
  }

  private static int findHcfByAlgo(int n1, int n2) {
    while (n2 != 0) {
      int r = n1 % n2;
      n1 = n2;
      n2 = r;
    }
    return n1;
  }

  private static String makeString() {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    sc.close();
    Map<Character, Integer> freq = new TreeMap<>();
    StringBuilder result = new StringBuilder();

    int i = 0;
    while (i < str.length()) {
      char c = str.charAt(i);
      int count = Character.getNumericValue(str.charAt(i + 1));
      freq.put(c, freq.getOrDefault(c, 0) + count);
      i = i + 2;
    }

    for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
      char ch = entry.getKey();
      int value = entry.getValue();
      for (int j = 0; j < value; j++) {
        result.append(ch);
      }
    }

    return result.toString();
  }

  private static int findProfit() {
    int[] arr = {100, 180, 260, 310, 40, 535, 695};

    int n = arr.length;
    int profit = 0;
    int max;
    int min;

    int i = 0;
    while (i < n - 1) {
      while (i < n - 1 && arr[i] > arr[i + 1]) {
        i++;
      }
      System.out.println("min index: " + i);
      min = arr[i];

      while (i < n - 1 && arr[i] <= arr[i + 1]) {
        i++;
      }
      System.out.println("max index: " + i);
      max = arr[i];

      profit += max - min;

    }

    return profit;
  }

  private static int findProfitSimple() {
    int[] arr = {100, 180, 260, 310, 40, 535, 695};

    int n = arr.length;
    int profit = 0;

    for (int i = 1; i < n; i++) {
      if (arr[i] >= arr[i - 1]) {
        profit += arr[i] - arr[i - 1];
      }
    }
    return profit;
  }

}
