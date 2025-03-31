package collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx01 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter length of List : ");
    int l = scan.nextInt();

    List<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < l; i++) {
      System.out.print("Enter the number: ");
      int num = scan.nextInt();
      numbers.add(num);
    }
    scan.close();
    System.out.println("ArrayList: " + numbers);

    numbers.stream()
        .filter(n -> n % 2 == 0)
        .forEach(n -> System.out.print(n + " "));

    numbers.stream()
        .filter(n -> n % 2 == 1)
        .map(n -> n * n)
        .forEach(n -> System.out.print(n + " "));
  }

}
