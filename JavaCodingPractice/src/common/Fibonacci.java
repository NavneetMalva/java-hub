package common;

import java.util.Scanner;

public class Fibonacci {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int count = scan.nextInt();
    scan.close();

    for (int i = 0; i < count; i++) {
      System.out.print(fibonacci(i) + " ");
    }

  }

  public static int fibonacci(int count) {

    if (count <= 1) {
      return count;
    } else {
      return fibonacci(count - 2) + fibonacci(count - 1);
    }

  }

}
