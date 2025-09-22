package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fib {
  public static void main(String[] args) {

    /* Your class should be named Solution.
     * Read input as specified in the question.
     * Print output as specified in the question.
     */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      list.add(fib(i));
    }
    System.out.println(list);

    System.out.println(list.get(n - 1));

    System.out.println("fibAtn: " + fibAtN(n));

  }

  private static int fib(int n) {
    if (n <= 1)
      return 1;
    else
      return fib(n - 2) + fib(n - 1);

  }

  private static int fibAtN(int n) {

    if (n == 1 || n == 2) return 1;
    int a = 1; // f1
    int b = 1; // f2
    int fib = 0;

    for (int i = 3; i <= n; i++) {
      fib = a + b;
      a = b;
      b = fib;
    }
    return fib;
  }
}
