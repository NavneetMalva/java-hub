package interview.vaco;

import java.util.stream.IntStream;

/**
 * PrimeNumbers.java
 * Created by Navneet Malva on 11/11/25 : 23:49.
 * <p>
 * Print the prime numbers using Java 8 Features only
 */
public class PrimeNumbers {

  public static void main(String[] args) {

    run();
    System.out.println();
    runUsingJava8();
  }

  private static void runUsingJava8() {
    IntStream.rangeClosed(1, 100)
        .filter(number -> number > 1
            && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(n -> number % n == 0))
        .forEach(n -> System.out.print(n + " "));

  }

  private static void run() {
    int limit = 100;
    for (int i = 2; i <= limit; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }

  // Check if a number is prime using a simple loop
  private static boolean isPrime(int num) {
    if (num <= 1) return false;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

}
